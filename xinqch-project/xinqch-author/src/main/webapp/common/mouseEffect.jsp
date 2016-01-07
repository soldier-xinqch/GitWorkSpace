<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%-- 鼠标烟花特效 --%>
<script type="text/javascript" src="../public/js/sketch.min.js"></script>
	<script type="text/javascript">
		function Particle(x, y, radius) {
			this.init(x, y, radius);
		}

		Particle.prototype = {
			init : function(x, y, radius) {
				this.alive = true;

				this.radius = radius || 10;
				this.wander = 0.15;
				this.theta = random(TWO_PI);
				this.drag = 0.92;
				this.color = '#777';

				this.x = x || 0.0;
				this.y = y || 0.0;

				this.vx = 0.0;
				this.vy = 0.0;
			},

			move : function() {

				this.x += this.vx;
				this.y += this.vy;

				this.vx *= this.drag;
				this.vy *= this.drag;

				this.theta += random(-0.5, 0.5) * this.wander;
				this.vx += sin(this.theta) * 0.1;
				this.vy += cos(this.theta) * 0.1;

				this.radius *= 0.96;
				this.alive = this.radius > 0.5;
			},

			draw : function(ctx) {
				ctx.beginPath();
				ctx.arc(this.x, this.y, this.radius, 0, TWO_PI);
				ctx.fillStyle = this.color;
				ctx.fill();
			}
		};

		// ----------------------------------------
		// Example
		// ----------------------------------------

		//粒子数量
		var MAX_PARTICLES = 180;
		var COLOURS = [ '#69D2E7', '#A7DBD8', '#E0E4CC', '#F38630', '#FA6900',
				'#FF4E50', '#F9D423' ];

		var particles = [];
		var pool = [];

		var demo = Sketch.create({
			container : document.getElementById('container')
		});

		demo.setup = function() {
			// Set off some initial particles.
			var i, x, y;
			for (i = 0; i < 16; i++) {
				x = (demo.width * 0.5) + random(-100, 100);
				y = (demo.height * 0.5) + random(-100, 100);
				demo.spawn(x, y);
			}
		};

		demo.spawn = function(x, y) {
			if (particles.length >= MAX_PARTICLES)
				pool.push(particles.shift());

			particle = pool.length ? pool.pop() : new Particle();
			//控制粒子的大小
			particle.init(x, y, random(5, 10));

			particle.wander = random(0.5, 2.0);
			particle.color = random(COLOURS);
			//控制粒子显示到消失的过度时间
			particle.drag = random(0.9, 0.99);

			theta = random(TWO_PI);
			//控制粒子飞翔的力度
			force = random(2, 8);

			particle.vx = sin(theta) * force;
			particle.vy = cos(theta) * force;
			//将一个个粒子保存在数组中
			particles.push(particle);
		}

		//粒子堆运动特效
		demo.update = function() {
			var i, particle;
			for (i = particles.length - 1; i >= 0; i--) {
				particle = particles[i];
				if (particle.alive)
					particle.move();
				else
					pool.push(particles.splice(i, 1)[0]);
			}
		};

		demo.draw = function() {
			//h5属性 图形覆盖  lighter ：显示源图像 + 目标图像。
			demo.globalCompositeOperation = 'lighter';
			for (var i = particles.length - 1; i >= 0; i--) {
				particles[i].draw(demo);
			}
		};
		demo.mousemove = function() {
			var particle, theta, force, touch, max, i, j, n;
			for (i = 0, n = demo.touches.length; i < n; i++) {
				touch = demo.touches[i], max = random(1, 4);
				for (j = 0; j < max; j++)
					//alert(touch.x+"         "+ touch.y);
					demo.spawn(touch.x, touch.y);
			}
		};
	</script>
