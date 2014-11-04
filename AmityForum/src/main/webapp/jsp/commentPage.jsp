<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/includes/header.jspf"%>

<!-- MAIN -->
<div id="main">
	<!-- wrapper-main -->
	<div class="wrapper">
		<!-- content -->
		<div id="content">
			<div>
				<!-- form -->
				<script type="text/javascript" src="js/form-validation.js"></script>
		<s:actionerror theme="bootstrap" />
			<s:actionmessage theme="bootstrap" />
				<div class="post">
					<h1>
						<a href="single.html"></a>
						<s:property value="post.title" />
					</h1>
					<div class="the-excerpt">
						<s:property value="post.message" />
					</div>
				</div>
				<s:form action="addComment" enctype="multipart/form-data"
					theme="bootstrap" cssClass="form-horizontal">
					<s:textfield name="post.postId" cssStyle="display:none" />
					<s:textarea tooltip="Write your comment or view"
						label="Write comment or view" name="comment.message" rows="4" />
					<s:submit cssClass="btn" type="submit" cssStyle="margin-left:250px" />

				</s:form>

				<h1>${post.comments.size()}Comments</h1>
				<s:iterator value="post.comments" status="status">
					<div id="comment">
						<div class="comment-details">
							<h3>
								<s:property value="user" />
							</h3>
							Commented On :<span class="date"> <s:date
									name="commentedOn" format="dd,MMM ,YYYY" /></span>
						</div>
						<div class="comment-text">
							<p>
								<s:property value="message" />
							</p>
						</div>
					</div>
				</s:iterator>
				<!-- ENDS form -->
			</div>
		</div>
		<!-- ENDS content -->

	</div>
	<!-- ENDS wrapper-main -->
</div>
<!-- ENDS MAIN -->
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