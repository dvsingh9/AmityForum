<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include page="includes/header.jsp" %>
	<!-- MAIN -->
	<div id="main">
		<!-- wrapper-main -->
		<div class="wrapper">

			<!-- content -->
			<div id="content">

				<!-- title -->
				<div id="page-title">
					<span class="title">Post a Message</span> <span class="subtitle">Donec
						eu libero sit amet quam egestas semper.</span>
				</div>
				<!-- ENDS title -->

				<!-- column (left)-->
				<div class="one-column">
					<!-- form -->
					<h2>Post</h2>
					<script type="text/javascript" src="js/form-validation.js"></script>
					<form id="contactForm" action="#" method="post">
						<fieldset>
							<div>
								<label>Name</label> <input name="name" id="name" type="text"
									class="form-poshytip" title="Enter your full name" />
							</div>
							<div>
								<label>Email</label> <input name="email" id="email" type="text"
									class="form-poshytip" title="Enter your email address" />
							</div>
							<div>
								<label>Website</label> <input name="web" id="web" type="text"
									class="form-poshytip" title="Enter your website" />
							</div>
							<div>
								<label>Comments</label>
								<textarea name="comments" id="comments" rows="5" cols="20"
									class="form-poshytip" title="Enter your comments"></textarea>
							</div>

							<!-- send mail configuration -->
							<input type="hidden" value="youremail@yourserver.com" name="to"
								id="to" /> <input type="hidden"
								value="youremail@yourserver.com" name="from" id="from" /> <input
								type="hidden" value="From torn wordpress online" name="subject"
								id="subject" /> <input type="hidden" value="send-mail.php"
								name="sendMailUrl" id="sendMailUrl" />
							<!-- ENDS send mail configuration -->

							<p>
								<input type="button" value="SEND" name="submit" id="submit" />
							</p>
						</fieldset>
						<p id="error" class="warning">Message</p>
					</form>
					<p id="success" class="success">Thanks for your comments.</p>
					<!-- ENDS form -->
				</div>
				<!-- ENDS column -->

				<!-- column (right)-->
				<div class="one-column">
					<!-- content -->
					<p>
						<img src="img/dummies/map.jpg" alt="map">
					</p>
					<p>Pellentesque habitant morbi tristique senectus et netus et
						malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat
						vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit
						amet quam egestas semper. Aenean ultricies mi vitae est. Mauris
						placerat eleifend leo.</p>
					<p>
						Chambers St 1254 New York City<br /> USA ZIP 44511<br /> (33) 1234
						5677, (33) 12459876<br /> <a href="mailto:email@server.com">email@server.com</a>
					</p>
					<!-- ENDS content -->
				</div>
				<!-- ENDS column -->

			</div>
			<!-- ENDS content -->

		</div>
		<!-- ENDS wrapper-main -->
	</div>
	<!-- ENDS MAIN -->

	<!-- Twitter -->
	<div id="twitter">
		<div class="wrapper">
			<a href="#" id="prev-tweet"></a> <a href="#" id="next-tweet"></a> <img
				id="bird" src="img/bird.png" alt="Tweets" />
			<div id="tweets">
				<ul class="tweet_list"></ul>
			</div>
		</div>
	</div>
	<!-- ENDS Twitter -->


	<!-- FOOTER -->
	<div id="footer">
		<!-- wrapper-footer -->
		<div class="wrapper">
			<!-- footer-cols -->
			<ul id="footer-cols">
				<li class="col">
					<h6>Pages</h6>
					<ul>
						<li class="page_item"><a href="index.html">Home</a></li>
						<li class="page_item"><a href="features.html">Features</a></li>
						<li class="page_item"><a href="blog.html">Blog</a></li>
						<li class="page_item"><a href="portfolio.html">Portfolio</a></li>
						<li class="page_item"><a href="gallery.html">Gallery</a></li>
						<li class="page_item"><a href="contact.html">Contact</a></li>
					</ul>
				</li>

				<li class="col">
					<h6>Categories</h6>
					<ul>
						<li><a href="#">Webdesign projects senectus</a></li>
						<li><a href="#/">Wordpress projects senectus</a></li>
						<li><a href="#">Vestibulum tortor quam</a></li>
						<li><a href="#">Code projects amet quam egestas</a></li>
						<li><a href="#">Web design projects senectus</a></li>
						<li><a href="#/">Marketplace projects</a></li>
						<li><a href="#">Writting projects senectus</a></li>
						<li><a href="#">Drawings projects fames Aenean</a></li>
						<li><a href="#/">Wordpress projects Aenean ultricies</a></li>
					</ul>
				</li>
				<li class="col">
					<h6>About the theme</h6> Pellentesque habitant morbi tristique
					senectus et netus et malesuada fames ac turpis egestas. Vestibulum
					tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante.
					Donec eu libero sit amet quam egestas semper. Aenean ultricies mi
					vitae est. Mauris placerat eleifend leo. Cursus faucibus, tortor
					neque egestas augue, eu vulputate magna eros.
				</li>

			</ul>
			<!-- ENDS footer-cols -->
		</div>
		<!-- ENDS wrapper-footer -->
	</div>
	<!-- ENDS FOOTER -->


	<!-- Bottom -->
	<div id="bottom">
		<!-- wrapper-bottom -->
		<div class="wrapper">
			<div id="bottom-text">
				2011 Nova all rights reserved. <a href="http://www.luiszuno.com">
					Luiszuno.com</a>
			</div>
			<!-- Social -->
			<ul class="social ">
				<li><a href="http://www.facebook.com"
					class="poshytip  facebook" title="Become a fan"></a></li>
				<li><a href="http://www.twitter.com" class="poshytip twitter"
					title="Follow our tweets"></a></li>
				<li><a href="http://www.dribbble.com" class="poshytip dribbble"
					title="View our work"></a></li>
				<li><a href="http://www.addthis.com" class="poshytip addthis"
					title="Tell everybody"></a></li>
				<li><a href="http://www.vimeo.com" class="poshytip vimeo"
					title="View our videos"></a></li>
				<li><a href="http://www.youtube.com" class="poshytip youtube"
					title="View our videos"></a></li>
			</ul>
			<!-- ENDS Social -->
			<div id="to-top" class="poshytip" title="To top"></div>
		</div>
		<!-- ENDS wrapper-bottom -->
	</div>
	<!-- ENDS Bottom -->

</body>
</html>