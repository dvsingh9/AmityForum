<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/includes/header.jspf"%>

<!-- MAIN -->
<div id="main">
	<!-- wrapper-main -->
	<div class="wrapper">
		<!-- content -->
		<div id="content">

			<!-- title -->
			<div id="page-title">
				<span class="title">Post Your Queries, Discussion</span> <span
					class="subtitle">Ask, Share, Discuss, Learn</span>
			</div>
			<!-- ENDS title -->
			<s:actionerror theme="bootstrap" />
			<s:actionmessage theme="bootstrap" />
			<!-- column (left)-->
			<div>
				<!-- form -->
				<script type="text/javascript" src="js/form-validation.js"></script>
				<s:form action="addPost" enctype="multipart/form-data"
					theme="bootstrap" cssClass="form-horizontal">
					<s:select tooltip="Select a category" label="Post Category"
						list="categories" listValue="name" listKey="id"
						name="post.category.id" />

					<s:textfield label="Title or Subject" name="post.title"
						tooltip="Provide a subject to your post" />

					<s:textarea tooltip="Enter message minimum 25 alphabetes"
						label="Message" name="post.message" cols="20" rows="4" />
					<s:submit cssClass="btn" type="submit" cssStyle="margin-left:250px" />
				</s:form>

				<!-- ENDS form -->
			</div>
			<!-- ENDS column -->

			<!-- column (right)-->

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