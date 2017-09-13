<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="This is social network html5 template available in themeforest......" />
		<meta name="keywords" content="Social Network, Social Media, Make Friends, Newsfeed, Profile Page" />
		<meta name="robots" content="index, follow" />
		<title>Edit Profile | My Interests</title>

    <!-- Stylesheets
    ================================================= -->
		<link rel="stylesheet" href="static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="static/css/style.css" />
		<link rel="stylesheet" href="static/css/ionicons.min.css" />
    <link rel="stylesheet" href="static/css/font-awesome.min.css" />
    
    <!--Google Font-->
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,400i,700,700i" rel="stylesheet">
    
    <!--Favicon-->
    <link rel="shortcut icon" type="image/png" href="static/images/fav.png"/>
	</head>
  <body>

    <!-- Header
    ================================================= -->
		<header id="header">
      <nav class="navbar navbar-default navbar-fixed-top menu">
        <div class="container">

          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index-register"><img src="static/images/logo.png" alt="logo" /></a>
          </div>

          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right main-menu">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home <span><img src="static/images/down-arrow.png" alt="" /></span></a>
                  <ul class="dropdown-menu newsfeed-home">
                    <li><a href="index">Landing Page 1</a></li>
                    <li><a href="index-register">Landing Page 2</a></li>
                  </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Newsfeed <span><img src="static/images/down-arrow.png" alt="" /></span></a>
                  <ul class="dropdown-menu newsfeed-home">
                    <li><a href="newsfeed">Newsfeed</a></li>
                    <li><a href="newsfeed-people-nearby">Poeple Nearly</a></li>
                    <li><a href="newsfeed-friends">My friends</a></li>
                    <li><a href="newsfeed-messages">Chatroom</a></li>
                    <li><a href="newsfeed-images">Images</a></li>
                    <li><a href="newsfeed-videos">Videos</a></li>
                  </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Timeline <span><img src="static/images/down-arrow.png" alt="" /></span></a>
                <ul class="dropdown-menu login">
                  <li><a href="timeline">Timeline</a></li>
                  <li><a href="timeline-about">Timeline About</a></li>
                  <li><a href="timeline-album">Timeline Album</a></li>
                  <li><a href="timeline-friends">Timeline Friends</a></li>
                  <li><a href="editprofile">Edit: Basic Info</a></li>
                  <li><a href="editEducation">Edit: Work</a></li>
                  <li><a href="editinterests">Edit: Interests</a></li>
                  <li><a href="edit-profile-settings">Account Settings</a></li>
                  <li><a href="editprofilePassword">Change Password</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle pages" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Pages <span><img src="static/images/down-arrow.png" alt="" /></span></a>
                <ul class="dropdown-menu page-list">
                  <li><a href="index">Landing Page 1</a></li>
                  <li><a href="index-register">Landing Page 2</a></li>
                  <li><a href="newsfeed">Newsfeed</a></li>
                  <li><a href="newsfeed-people-nearby">Poeple Nearly</a></li>
                  <li><a href="newsfeed-friends">My friends</a></li>
                  <li><a href="newsfeed-messages">Chatroom</a></li>
                  <li><a href="newsfeed-images">Images</a></li>
                  <li><a href="newsfeed-videos">Videos</a></li>
                  <li><a href="timeline">Timeline</a></li>
                  <li><a href="timeline-about">Timeline About</a></li>
                  <li><a href="timeline-album">Timeline Album</a></li>
                  <li><a href="timeline-friends">Timeline Friends</a></li>
                  <li><a href="editprofile">Edit Profile</a></li>
                  <li><a href="contact">Contact Us</a></li>
                </ul>
              </li>
              <li class="dropdown"><a href="contact">Contact</a></li>
            </ul>
            <form class="navbar-form navbar-right hidden-sm">
              <div class="form-group">
                <i class="icon ion-android-search"></i>
                <input type="text" class="form-control" placeholder="Search friends, photos, videos">
              </div>
            </form>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container -->
      </nav>
    </header>
    <!--Header End-->

    <div class="container">

      <!-- Timeline
      ================================================= -->
      <div class="timeline">
        <div class="timeline-cover">

          <!--Timeline Menu for Large Screens-->
          <div class="timeline-nav-bar hidden-sm hidden-xs">
            <div class="row">
              <div class="col-md-3">
                <div class="profile-info">
                  <img src="http://placehold.it/300x300" alt="" class="img-responsive profile-photo" />
                  <h3>${sessionScope.state[0].firstName}</h3>
                  <p class="text-muted">Creative Director</p>
                </div>
              </div>
              <div class="col-md-9">
                <ul class="list-inline profile-menu">
                  <li><a href="timeline">Timeline</a></li>
                  <li><a href="timeline-about" class="active">About</a></li>
                  <li><a href="timeline-album">Album</a></li>
                  <li><a href="timeline-friends">Friends</a></li>
                </ul>
                <ul class="follow-me list-inline">
                  <li>1,299 people following her</li>
                  <li><button class="btn-primary">Add Friend</button></li>
                </ul>
              </div>
            </div>
          </div><!--Timeline Menu for Large Screens End-->

          <!--Timeline Menu for Small Screens-->
          <div class="navbar-mobile hidden-lg hidden-md">
            <div class="profile-info">
              <img src="http://placehold.it/300x300" alt="" class="img-responsive profile-photo" />
              <h4>${sessionScope.state[0].firstName}</h4>
              <p class="text-muted">Creative Director</p>
            </div>
            <div class="mobile-menu">
              <ul class="list-inline">
                <li><a href="timline">Timeline</a></li>
                <li><a href="timeline-about" class="active">About</a></li>
                <li><a href="timeline-album">Album</a></li>
                <li><a href="timeline-friends">Friends</a></li>
              </ul>
              <button class="btn-primary">Add Friend</button>
            </div>
          </div><!--Timeline Menu for Small Screens End-->

        </div>
        <div id="page-contents">
          <div class="row">
            <div class="col-md-3">
              
              <!--Edit Profile Menu-->
              <ul class="edit-menu">
              	<li><i class="icon ion-ios-information-outline"></i><a href="editprofile">Basic Information</a></li>
              	<li><i class="icon ion-ios-briefcase-outline"></i><a href="editEducation">Education and Work</a></li>
              	<li class="active"><i class="icon ion-ios-heart-outline"></i><a href="editinterests">My Interests</a></li>
                <li><i class="icon ion-ios-settings"></i><a href="edit-profile-settings">Account Settings</a></li>
              	<li><i class="icon ion-ios-locked-outline"></i><a href="editprofilePassword">Change Password</a></li>
              </ul>
            </div>
            <div class="col-md-7">

              <!-- Edit Interests
              ================================================= -->
              <div class="edit-profile-container">
                <div class="block-title">
                  <h4 class="grey"><i class="icon ion-ios-heart-outline"></i>My Interests</h4>
                  <div class="line"></div>
                  <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate</p>
                  <div class="line"></div>
                </div>
                <div class="edit-block">
                  <ul class="list-inline interests">
                  	<li><a href=""><i class="icon ion-android-bicycle"></i> Bycicle</a></li>
                  	<li><a href=""><i class="icon ion-ios-camera"></i> Photgraphy</a></li>
                  	<li><a href=""><i class="icon ion-android-cart"></i> Shopping</a></li>
                  	<li><a href=""><i class="icon ion-android-plane"></i> Traveling</a></li>
                  	<li><a href=""><i class="icon ion-android-restaurant"></i> Eating</a></li>
                  </ul>
                  <div class="line"></div>
                  <div class="row">
                    <p class="custom-label"><strong>Add interests</strong></p>
                    
                    <form:form modelAttribute="INTREST" method="POST" action="editInterest">
                    <div class="form-group col-sm-8">
                      <form:input path="name" id="add-interest" class="form-control input-group-lg" type="text" name="interest" title="Choose Interest" placeholder="Interests. For example, photography"/>
                    </div>
                    <div class="form-group col-sm-4">
                      <button class="btn btn-primary">Add</button>
                    </div>
                   
                    </form:form>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-2 static">
              
              <!--Sticky Timeline Activity Sidebar-->
              <div id="sticky-sidebar">
                <h4 class="grey">${sessionScope.state[0].firstName}'s activity</h4>
                <div class="feed-item">
                  <div class="live-activity">
                    <p><a href="#" class="profile-link">${sessionScope.state[0].firstName}</a> Commended on a Photo</p>
                    <p class="text-muted">5 mins ago</p>
                  </div>
                </div>
                <div class="feed-item">
                  <div class="live-activity">
                    <p><a href="#" class="profile-link">${sessionScope.state[0].firstName}</a> Has posted a photo</p>
                    <p class="text-muted">an hour ago</p>
                  </div>
                </div>
                <div class="feed-item">
                  <div class="live-activity">
                    <p><a href="#" class="profile-link">${sessionScope.state[0].firstName}</a> Liked her friend's post</p>
                    <p class="text-muted">4 hours ago</p>
                  </div>
                </div>
                <div class="feed-item">
                  <div class="live-activity">
                    <p><a href="#" class="profile-link">${sessionScope.state[0].firstName}</a> has shared an album</p>
                    <p class="text-muted">a day ago</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>


    <!-- Footer
    ================================================= -->
    <footer id="footer">
      <div class="container">
      	<div class="row">
          <div class="footer-wrapper">
            <div class="col-md-3 col-sm-3">
              <a href=""><img src="static/images/logo-black.png" alt="" class="footer-logo" /></a>
              <ul class="list-inline social-icons">
              	<li><a href="#"><i class="icon ion-social-facebook"></i></a></li>
              	<li><a href="#"><i class="icon ion-social-twitter"></i></a></li>
              	<li><a href="#"><i class="icon ion-social-googleplus"></i></a></li>
              	<li><a href="#"><i class="icon ion-social-pinterest"></i></a></li>
              	<li><a href="#"><i class="icon ion-social-linkedin"></i></a></li>
              </ul>
            </div>
            <div class="col-md-2 col-sm-2">
              <h5>For individuals</h5>
              <ul class="footer-links">
                <li><a href="">Signup</a></li>
                <li><a href="">login</a></li>
                <li><a href="">Explore</a></li>
                <li><a href="">Finder app</a></li>
                <li><a href="">Features</a></li>
                <li><a href="">Language settings</a></li>
              </ul>
            </div>
            <div class="col-md-2 col-sm-2">
              <h5>For businesses</h5>
              <ul class="footer-links">
                <li><a href="">Business signup</a></li>
                <li><a href="">Business login</a></li>
                <li><a href="">Benefits</a></li>
                <li><a href="">Resources</a></li>
                <li><a href="">Advertise</a></li>
                <li><a href="">Setup</a></li>
              </ul>
            </div>
            <div class="col-md-2 col-sm-2">
              <h5>About</h5>
              <ul class="footer-links">
                <li><a href="">About us</a></li>
                <li><a href="">Contact us</a></li>
                <li><a href="">Privacy Policy</a></li>
                <li><a href="">Terms</a></li>
                <li><a href="">Help</a></li>
              </ul>
            </div>
            <div class="col-md-3 col-sm-3">
              <h5>Contact Us</h5>
              <ul class="contact">
                <li><i class="icon ion-ios-telephone-outline"></i>+1 (234) 222 0754</li>
                <li><i class="icon ion-ios-email-outline"></i>info@thunder-team.com</li>
                <li><i class="icon ion-ios-location-outline"></i>228 Park Ave S NY, USA</li>
              </ul>
            </div>
          </div>
      	</div>
      </div>
      <div class="copyright">
        <p>Thunder Team ?2016. All rights reserved</p>
      </div>
		</footer>
    
    <!--preloader-->
    <div id="spinner-wrapper">
      <div class="spinner"></div>
    </div>

    <!-- Scripts
    ================================================= -->
    <script src="static/js/jquery-3.1.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/jquery.sticky-kit.min.js"></script>
    <script src="static/js/jquery.scrollbar.min.js"></script>
    <script src="static/js/script.js"></script>
    
  </body>
</html>
