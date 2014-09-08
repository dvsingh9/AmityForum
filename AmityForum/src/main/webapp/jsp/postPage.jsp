<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/includes/header.jspf" %>


		<!-- MAIN -->
			<div id="main">
				<!-- wrapper-main -->
				<div class="wrapper">
					
					<!-- content -->
					<div id="content">
						
						<!-- title -->
						<div id="page-title">
							<span class="title">Post Your Queries, Discussion</span>
							<span class="subtitle">Ask, Share, Discuss, Learn</span>
						</div>
						<!-- ENDS title -->
							
						<!-- column (left)-->
						<div class="one-column">
							<!-- form -->
							<script type="text/javascript" src="js/form-validation.js"></script>
							<form id="contactForm" action="addPost" method="post">
								<fieldset>
									<div>
										<label>Category</label>
										<input name="category"  id="category" type="text" class="form-poshytip" />
									</div>
									<div>
										<label>Title</label>
										<input name="title"  id="title" type="text" class="form-poshytip" title="Enter a Title" />
									</div>
									<div>
										<label>Post</label>
										<textarea  name="message"  id="postMessage" rows="5" cols="20" class="form-poshytip" title="Enter your Post Message"></textarea>
									</div>
									
									<!-- send mail configuration -->
									<input type="hidden" value="youremail@yourserver.com" name="to" id="to" />
									<input type="hidden" value="youremail@yourserver.com" name="from" id="from" />
									<input type="hidden" value="From torn wordpress online" name="subject" id="subject" />
									<input type="hidden" value="send-mail.php" name="sendMailUrl" id="sendMailUrl" />
									<!-- ENDS send mail configuration -->
									
									<p><input type="submit" value="submit" name="submit" id="submit" /></p>
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
							<p><img src="img/dummies/map.jpg" alt="map"></p>
							<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>					
							<p>Chambers St 1254 New York City<br/>
							USA ZIP 44511<br/>
							(33) 1234 5677, (33) 12459876<br/>
							<a href="mailto:email@server.com">email@server.com</a></p>
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
					<a href="#" id="prev-tweet"></a>
					<a href="#" id="next-tweet"></a>
					<img id="bird" src="img/bird.png" alt="Tweets" />
					<div id="tweets">
						<ul class="tweet_list"></ul>
					</div>
				</div>
			</div>
			<!-- ENDS Twitter -->

			


<%@include file="/includes/footer.jspf" %>