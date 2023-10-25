<#list pageablePrograms.content as program>
<div class="col-lg-6">
    <article class="d-flex flex-column">

        <div class="post-img">
            <img src="${program.imgPath}" alt="" class="img-fluid">
<#--            <img src="assets/img/blog/amazon.jpg" alt="" class="img-fluid">-->
        </div>

        <h2 class="title">
            <a href="/programs/${program.company.companyUrlPath}/${program.programUrlPath}">${program.title}</a>
        </h2>

        <div class="meta-top">
            <ul>
                <li class="d-flex align-items-center"><i class="bi bi-person"></i><a href="/programs/${program.company.companyUrlPath}/${program.programUrlPath}">${program.company.companyName}</a></li>
                <li class="d-flex align-items-center"><i class="bi bi-clock"></i> <a href="/programs/${program.company.companyUrlPath}/${program.programUrlPath}"><time datetime="${program.deadline}">${program.deadline}</time></a></li>
                <li class="d-flex align-items-center"><i class="bi bi-eye"></i> <a href="/programs/${program.company.companyUrlPath}/${program.programUrlPath}">${program.reviewCount} reviews</a></li>
            </ul>
        </div>

        <div class="content">
            <p>
                ${program.shortDescription}
            </p>
        </div>

        <div class="read-more mt-auto align-self-end">
            <a href="/programs/${program.company.companyUrlPath}/${program.programUrlPath}">View Post</a>
        </div>

    </article>
</div>
</#list>