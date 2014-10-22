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
							<span class="title">The Blog</span>
							<span class="subtitle">Donec eu libero sit amet quam egestas semper.</span>
						</div>
						<!-- ENDS title -->
						
						<!-- Posts -->
						<div id="posts">
						<s:iterator value="posts" status="status">
							<!-- post -->
							<div class="post">
								<h1><a href="single.html"></a><s:property value="title"/> </h1>
								<div class="n-comments">165</div>
								
								<!-- shadow -->
								<div class="thumb-shadow">
								
									<!-- post-thumb -->
									<div class="post-thumbnail">
										<!-- meta -->
										<ul class="meta">
											<li><strong>Posted by</strong> <s:property value="postedBy"/>
											<a href="http://www.facebook.com"
															class="poshytip  facebook" title="Catch me on Fb"> Facebook User</a></li>  
										<li><strong>On : </strong> <s:property value="#attr.postedDate"/><span style="margin-left:250px"><strong>Category :</strong><s:property value="category.name"/></span> </li>
											
										</ul>
										<!-- ENDS meta -->
									</div>
									<!-- ENDS post-thumb -->
									
									<div class="the-excerpt">
										<s:property value="message"/>
									</div>		
									<a href="single.html" class="read-more link-button"><span>Read more</span></a>	
								
								</div>
								<!-- ENDS shadow -->
							</div>
							<!-- ENDS post -->
						</s:iterator>	
						</div>
						<!-- ENDS Posts -->	

						<!-- sidebar -->
						<ul id="sidebar">
							<!-- init sidebar -->
							<li>
								<h6>Categories to Search</h6>		
								<ul>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[0].id}" title="View all posts">${categories[0].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[1].id}" title="View all posts">${categories[1].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[2].id}" title="View all posts">${categories[2].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[3].id}" title="View all posts">${categories[3].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[4].id}" title="View all posts">${categories[4].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[5].id}" title="View all posts">${categories[5].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[6].id}" title="View all posts">${categories[6].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[7].id}" title="View all posts">${categories[7].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[8].id}" title="View all posts">${categories[8].name}</a></li>	
								</ul>
							</li>	
							
							<li>
								<h6>Archives All</h6>		
								<ul>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[0].id}" title="View all posts">${categories[0].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[1].id}" title="View all posts">${categories[1].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[2].id}" title="View all posts">${categories[2].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[3].id}" title="View all posts">${categories[3].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[4].id}" title="View all posts">${categories[4].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[5].id}" title="View all posts">${categories[5].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[6].id}" title="View all posts">${categories[6].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[7].id}" title="View all posts">${categories[7].name}</a></li>
									<li class="cat-item"><a href="searchPostForCategory?categoryId=${categories[8].id}" title="View all posts">${categories[8].name}</a></li>	
								</ul>
							</li>
							<!-- ENDS init sidebar -->
						</ul>
						<!-- ENDS sidebar -->
		
					</div>
					<!-- ENDS content -->

				</div>
				</div>
				<!-- ENDS wrapper-main -->
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