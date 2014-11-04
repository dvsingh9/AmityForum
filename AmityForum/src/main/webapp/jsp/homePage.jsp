<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="action.facebook.FBConnection"%>
<%@include file="/includes/header.jspf"%>

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
		<s:if test="#session.userInfo != null">
		<span class="main">You are Logged In as : <s:property value="#session.userInfo.name"/></span> 
		</s:if><s:else>
			<span class="main">Login Using Facebook</span> <span class="sub">Use
				facebook for login and writing posts and comments</span> <a
				href="<%=fbConnection.getFBAuthUrl()%>" id="link"
				class="btn-auth btn-facebook"><span>Sign In with Facebook</span></a>
		</s:else>		
		</div>
		
		<!-- ENDS headline -->

		<!-- content -->
		<div id="content">

			<!-- tab "panes" -->
			<div class="panes">

				<h6>Forum for Amity university, Noida.</h6>
				<p>This project is designed for the students of Amity University
					or those who are wishing to join or student of  Amity University, Noida. They are having a lot of
					queries about academics. This forum will help them to avoid
					visiting University for their queries.</p>
				<a href="HomePage" class="link-button"><span>Read more
						&#8594;</span></a>
			</div>
		</div>
		<!-- ENDS Information -->

		<!-- Posts -->
		<div></div>
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

<%@include file="/includes/footer.jspf"%>
