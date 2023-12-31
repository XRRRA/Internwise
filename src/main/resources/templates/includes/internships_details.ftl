<main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <div class="breadcrumbs">
        <div class="container">

            <div class="d-flex justify-content-between align-items-center">
                <h2>Internship Details</h2>
                <ol>
                    <li><a href="/home">Home</a></li>
                    <li><a href="/programs">Internships</a></li>
                    <li>Internship Details</li>
                </ol>
            </div>

        </div>
    </div><!-- End Breadcrumbs -->

    <!-- ======= Blog Details Section ======= -->
    <section id="blog" class="blog">
        <div class="container" data-aos="fade-up">

            <div class="row g-5">

                <div class="col-lg-8">

                    <article class="blog-details">

                        <div class="post-img">
                            <img src="${program.imgPath}" alt="" class="img-fluid">
                        </div>

                        <h2 class="title">${program.getTitle()}</h2>

                        <div class="meta-top">
                            <ul>
                                <li class="d-flex align-items-center"><i class="bi bi-person"></i>${program.company.companyName}</li>
                                <li class="d-flex align-items-center"><i class="bi bi-clock"></i><time datetime="${program.deadline}">${program.deadline}</time></li>
                                <li class="d-flex align-items-center"><i class="bi bi-heart"></i>${program.reviewCount} reviews</li>
                            </ul>
                        </div><!-- End meta top -->

                        <div class="content">
                            <p>
                                ${program.shortDescription}
                            </p>
                            <section id="faq" class="faq">
                                <div class="container" data-aos="fade-up">

                                    <div class="row gy-4">

                                        <div class="col-lg-12 d-flex flex-column justify-content-center align-items-stretch">

                                            <div class="accordion accordion-flush px-xl-5" id="faqlist">

                                                <div class="accordion-item" data-aos="fade-up" data-aos-delay="200">
                                                    <h2 class="accordion-header">
                                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-1">
                                                            <i class="bi bi-list-check question-icon"></i>
                                                            1. Responsibilities
                                                        </button>
                                                    </h2>
                                                    <div id="faq-content-1" class="accordion-collapse collapse" data-bs-parent="#faqlist">
                                                        <div class="accordion-body">
                                                            <p>
                                                                ${program.responsibilities}
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="accordion-item" data-aos="fade-up" data-aos-delay="300">
                                                    <h2 class="accordion-header">
                                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-2">
                                                            <i class="bi bi-gift question-icon"></i>
                                                            2. Offers
                                                        </button>
                                                    </h2>
                                                    <div id="faq-content-2" class="accordion-collapse collapse" data-bs-parent="#faqlist">
                                                        <div class="accordion-body">
                                                            <p>
                                                                ${program.offers}
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="accordion-item" data-aos="fade-up" data-aos-delay="400">
                                                    <h2 class="accordion-header">
                                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-3">
                                                            <i class="bi bi-file-earmark-text question-icon"></i>
                                                            3. Requirements
                                                        </button>
                                                    </h2>
                                                    <div id="faq-content-3" class="accordion-collapse collapse" data-bs-parent="#faqlist">
                                                        <div class="accordion-body">
                                                            <ul class="requirements-list">
                                                                <li>The knowledge: ${program.knowledgeNeeded}</li>
                                                                <li>The experience: ${program.experienceNeeded}</li>
                                                                <li>The work-Schedule: ${program.workSchedule}</li>
                                                                <li>The requirements: ${program.requirements}</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="accordion-item" data-aos="fade-up" data-aos-delay="500">
                                                    <h2 class="accordion-header">
                                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-4">
                                                            <i class="bi bi-info-circle question-icon"></i>
                                                            4. All That You Should Know About This Internship
                                                        </button>
                                                    </h2>
                                                    <div id="faq-content-4" class="accordion-collapse collapse" data-bs-parent="#faqlist">
                                                        <div class="accordion-body">
                                                            <ul class="knowledge-list">
                                                                <li>Duration: ${program.duration}</li>
                                                                <li>Location: ${program.location}</li>
                                                                <li>Work place: ${program.workPlace}</li>
                                                                <li>Number of available positions: ${program.nrPositions}</li>
                                                                <li>Salary: ${program.salary}</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>

                                    </div>

                                </div>
                            </section>

                            <h3>OKAY, but what is the general description?</h3>
                            <p>
                                ${program.description}
                            </p>

                        </div><!-- End post content -->

                        <div class="meta-bottom">
                            <i class="bi bi-trophy"></i>
                            <ul class="cats">
                                <li><a href="${program.company.contacts}">${program.company.companyName}</a></li>
                            </ul>

                            <i class="bi bi-lightbulb"></i>
                            <ul class="tags">
                                <li>Creative</li>
                                <li>Smart</li>
                                <li>Innovative</li>
                            </ul>

                            <!-- 5-Star Rating System -->
                            <div class="rating">
                                <span class="star" id="star1" onclick="rateInternship(1)">&#9733;</span>
                                <span class="star" id="star2" onclick="rateInternship(2)">&#9733;</span>
                                <span class="star" id="star3" onclick="rateInternship(3)">&#9733;</span>
                                <span class="star" id="star4" onclick="rateInternship(4)">&#9733;</span>
                                <span class="star" id="star5" onclick="rateInternship(5)">&#9733;</span>
                            </div>

                            <!-- "Post" Button -->
                            <button class="post-button" onclick="postReview()">Post</button>
                        </div>



                    </article><!-- End blog post -->

                    <div class="post-author d-flex align-items-center">
                        <img src="${program.company.companyImgPath}" class="rounded-circle flex-shrink-0" alt="">
                        <div>
                            <h4>${program.company.companyName}</h4>
                            <div class="social-links">
                                <a href="https://twitters.com/#"><i class="bi bi-twitter"></i></a>
                                <a href="https://facebook.com/#"><i class="bi bi-facebook"></i></a>
                                <a href="https://instagram.com/#"><i class="biu bi-instagram"></i></a>
                            </div>
                            <p>
                                ${program.company.description}
                            </p>
                        </div>
                    </div><!-- End post author -->

                    <div class="comments">

                        <h4 class="comments-count">8 Comments</h4>

                        <div id="comment-1" class="comment">
                            <div class="d-flex">
                                <div class="comment-img"><img src="/assets/img/blog/girl1.jpg" alt=""></div>
                                <div>
                                    <h5><a href="">Sarah Willson</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                    <time datetime="2023-10-08">08 Oct,2023</time>
                                    <p>
                                        I'm thrilled to have the opportunity to intern with Amazon Web Dynamo! 💼🚀
                                    </p>
                                </div>
                            </div>
                        </div><!-- End comment #1 -->

                        <div id="comment-2" class="comment">
                            <div class="d-flex">
                                <div class="comment-img"><img src="assets/img/blog/man2.jpg" alt=""></div>
                                <div>
                                    <h5><a href="">Aron Alvarado</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                    <time datetime="2023-10-05">05 Oct,2023</time>
                                    <p>
                                        I'm a bit nervous because it's such a big responsibility.
                                    </p>
                                </div>
                            </div>

                            <div id="comment-reply-1" class="comment comment-reply">
                                <div class="d-flex">
                                    <div class="comment-img"><img src="assets/img/blog/girl2.jpg" alt=""></div>
                                    <div>
                                        <h5><a href="">Ana Casper</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                        <time datetime="2023-10-05">05 Oct,2023</time>
                                        <p>
                                            Feeling a bit nervous is completely normal, especially when you're stepping into a role with such a significant responsibility. Just remember that it's an opportunity to learn, grow, and showcase your skills. You've got this! Your dedication and hard work will shine through, and you'll gain valuable experience along the way. Don't hesitate to reach out if you ever need advice or support – we're all here to help you succeed! 💪😊
                                        </p>
                                    </div>
                                </div>

                                <div id="comment-reply-2" class="comment comment-reply">
                                    <div class="d-flex">
                                        <div class="comment-img"><img src="assets/img/blog/man1.jpg" alt=""></div>
                                        <div>
                                            <h5><a href="">Greg Ramsay</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                            <time datetime="2023-10-05">05 Oct,2023</time>
                                            <p>
                                                It's normal to feel nervous when facing a big responsibility, but remember, every challenge is an opportunity to learn and grow. You've got what it takes to excel in this role, and your team is here to support you. Embrace the challenge and give it your best!
                                            </p>
                                        </div>
                                    </div>

                                </div><!-- End comment reply #2-->

                            </div><!-- End comment reply #1-->

                        </div><!-- End comment #2-->

                        <div id="comment-3" class="comment">
                            <div class="d-flex">
                                <div class="comment-img"><img src="assets/img/blog/girl4.jpg" alt=""></div>
                                <div>
                                    <h5><a href="">Leyla Siemens</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                    <time datetime="2023-10-03">03 Oct,2023</time>
                                    <p>
                                        Am I really qualified for this? I'm worried about imposter syndrome.
                                    </p>
                                </div>
                            </div>

                        </div><!-- End comment #3 -->

                        <div id="comment-4" class="comment">
                            <div class="d-flex">
                                <div class="comment-img"><img src="assets/img/blog/girl5.jpg" alt=""></div>
                                <div>
                                    <h5><a href="">Kailye Duggan</a> <a href="#" class="reply"><i class="bi bi-reply-fill"></i> Reply</a></h5>
                                    <time datetime="2023-10-02">02 Oct,2023</time>
                                    <p>
                                        I hope to learn a ton during my time at Amazon and further develop my skills. 📖🖥️
                                    </p>
                                </div>
                            </div>

                        </div><!-- End comment #4 -->

                        <div class="reply-form">
                            <h4>Leave your Candidature</h4>
                            <p>Write us your credentials and send us your CV!</p>
                            <form id="candidature-form" action="#" onsubmit="return validateForm()">
                                <div class="row">
                                    <div class="col form-group">
                                        <input name="first-name" type="text" class="form-control" placeholder="First Name*" required>
                                        <div class="error-message" id="first-name-error"></div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col form-group">
                                        <input name="last-name" type="text" class="form-control" placeholder="Last Name*" required>
                                        <div class="error-message" id="last-name-error"></div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col form-group">
                                        <input name="email" type="email" class="form-control" placeholder="Email*" required>
                                        <div class="error-message" id="email-error"></div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col form-group">
                                        <input name="cv" type="file" class="form-control" accept=".pdf, .doc, .docx" placeholder="Choose Your File" required>
                                        <div class="error-message" id="cv-error" style="color: red;"></div>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary" style="margin-left: 10px;">Send</button>
                            </form>
                        </div>

                    </div><!-- End blog comments -->

                </div>
                <div class="col-lg-4">
                    <div class="sidebar">
                        <div class="sidebar-item search-form">
                            <h3 class="sidebar-title">Search</h3>
                            <form action="" class="mt-3">
                                <input type="text" id="search-input">
                                <button type="submit"><i class="bi bi-search"></i></button>
                            </form>
                        </div><!-- End sidebar search form -->

                        <div class="sidebar-item categories">
                            <h3 class="sidebar-title">Categories</h3>
                            <ul class="mt-3">
                                <li><a href="#">Full Stack Developer <span>(457)</span></a></li>
                                <li><a href="#">Front End Developer <span>(254)</span></a></li>
                                <li><a href="#">Back End Developer<span>(199)</span></a></li>
                                <li><a href="#">UI/UX Developer <span>(170)</span></a></li>
                                <li><a href="#">Python Developer <span>(157)</span></a></li>
                                <li><a href="#">C++ Developer <span>(152)</span></a></li>
                                <li><a href="#">Java Developer <span>(141)</span></a></li>
                            </ul>
                        </div><!-- End sidebar categories -->

                        <div class="sidebar-item tags">
                            <h3 class="sidebar-title">Tags</h3>
                            <ul id="tags-list" class="mt-3">
                                <!-- Tags will be added dynamically here -->
                            </ul>
                        </div><!-- End sidebar tags -->
                    </div><!-- End Blog Sidebar -->
                </div>
            </div>
        </div>
    </section><!-- End Blog Section -->

</main><!-- End #main -->
