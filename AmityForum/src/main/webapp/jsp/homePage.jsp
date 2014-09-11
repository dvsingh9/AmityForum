<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@page import="action.facebook.FBConnection"%>
<%@include file="/includes/header.jspf" %>

	<!-- Slider -->
<!-- 	<div id="slider-block"> -->
<!-- 		<div id="slider-holder"> -->
<!-- 			<div id="slider"> -->
<!-- 				<a href="http://www.luiszuno.com"><img src="/images/01.jpg" -->
<!-- 					title="Visit my web site regularly and get freebies each week!" -->
<!-- 					alt="" /></a> <a -->
<!-- 					href="http://themeforest.net/user/Ansimuz/portfolio?ref=ansimuz"><img -->
<!-- 					src="/images/02.jpg" -->
<!-- 					title="Support the freebies buying high quality premium themes from my portfolio at themeforest" -->
<!-- 					alt="" /></a> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->
	<!-- ENDS Slider -->
<%
	FBConnection fbConnection = new FBConnection();
%>
	<!-- MAIN -->
	<div id="main">
		<!-- wrapper-main -->
		<div class="wrapper">

			<!-- headline -->
			<div class="clear"></div>
			<div id="headline">
				<span class="main">Login Using Facebook</span> <span
					class="sub">Use facebook for login and posting your posts</span> <a
					href="<%=fbConnection.getFBAuthUrl()%>"
					id="link" class="btn-auth btn-facebook"><span>Sign In with Facebook</span></a>
			</div>
			
			<!-- ENDS headline -->

			<!-- content -->
			<div id="content">

				<!-- TABS -->
				<!-- the tabs -->
				<ul class="tabs">
					<li><a href="#"><span>Featured Pages</span></a></li>
					<li><a href="#"><span>Information</span></a></li>
					<li><a href="#"><span>Recent posts</span></a></li>
				</ul>

				<!-- tab "panes" -->
				<div class="panes">

					<!-- Posts -->
					<div>
						<ul class="blocks-thumbs thumbs-rollover">
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
						</ul>
					</div>
					<!-- ENDS posts -->

					<!-- Information  -->
					<div>
						<div class="plain-text">
							<h6>Pellentesque habitant morbi tristique senectus et netus
								et malesuada.</h6>
							<p>Fames ac turpis egestas. Vestibulum tortor quam, feugiat
								vitae, ultricies eget, tempor sit amet, ante. Donec eu libero
								sit amet quam egestas semper. Aenean ultricies mi vitae est.
								Mauris placerat eleifend leo. Cursus faucibus, tortor neque
								egestas augue, eu vulputate magna eros eu erat. Aliquam erat
								volutpat. Nam dui mi, tincidunt quis, accumsan porttitor,
								facilisis luctus, metus.</p>
							<p>
								Fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
								ultricies eget, tempor sit amet, ante. Donec eu libero sit amet
								quam egestas semper. Aenean ultricies mi vitae est. Mauris
								placerat eleifend leo. Cursus faucibus, tortor neque egestas
								augue, eu vulputate magna eros eu erat. Aliquam erat volutpat.
								Nam dui mi, tincidunt quis, accumsan porttitor, facilisis
								luctus, metus.Fames ac turpis egestas. Vestibulum tortor quam,
								feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
								libero sit amet quam egestas semper <a href="single.html">This
									is a link</a>. Aenean ultricies mi vitae est. Mauris placerat
								eleifend leo. Cursus faucibus, tortor neque egestas augue, eu
								vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi,
								tincidunt quis, accumsan porttitor, facilisis luctus, metus.
							</p>
							<a href="single.html" class="link-button"><span>Read
									more &#8594;</span></a>
						</div>
					</div>
					<!-- ENDS Information -->

					<!-- Posts -->
					<div>
						<ul class="blocks-thumbs thumbs-rollover">
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
							<li><a href="single.html" class="thumb" title="An image"><img
									src="img/dummies/282x150.gif" alt="Post" /></a>
								<div class="excerpt">
									<a href="single.html" class="header">Lorem ipsum dolor</a>
									Pellentesque habitant morbi tristique senectus et netus et
									malesuada fames ac turpis egestas. Vestibulum tortor quam,
									feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu
									libero sit amet quam egestas semper. Aenean ultricies mi vitae
									est. Mauris placerat eleifend leo. Quisque sit amet est et
									sapien ullamcorper pharetra.
								</div> <a href="single.html" class="link-button"><span>Read
										more &#8594;</span></a></li>
						</ul>
					</div>
					<!-- ENDS posts -->


				</div>
				<!-- ENDS TABS -->



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

<%@include file="/includes/footer.jspf" %>
	