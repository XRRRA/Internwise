
document.addEventListener('DOMContentLoaded', () => {
  "use strict";




  /**
   * Preloader
   */
  const preloader = document.querySelector('#preloader');
  if (preloader) {
    window.addEventListener('load', () => {
      preloader.remove();
    });
  }

  /**
   * Sticky header on scroll
   */
  const selectHeader = document.querySelector('#header');
  if (selectHeader) {
    document.addEventListener('scroll', () => {
      window.scrollY > 100 ? selectHeader.classList.add('sticked') : selectHeader.classList.remove('sticked');
    });
  }

  /**
   * Navbar links active state on scroll
   */
  let navbarlinks = document.querySelectorAll('#navbar .scrollto');

  function navbarlinksActive() {
    navbarlinks.forEach(navbarlink => {

      if (!navbarlink.hash) return;

      let section = document.querySelector(navbarlink.hash);
      if (!section) return;

      let position = window.scrollY;
      if (navbarlink.hash != '#header') position += 200;

      if (position >= section.offsetTop && position <= (section.offsetTop + section.offsetHeight)) {
        navbarlink.classList.add('active');
      } else {
        navbarlink.classList.remove('active');
      }
    })
  }
  window.addEventListener('load', navbarlinksActive);
  document.addEventListener('scroll', navbarlinksActive);

  /**
   * Function to scroll to an element with top ofset
   */
  function scrollto(el) {
    const selectHeader = document.querySelector('#header');
    let offset = 0;

    if (selectHeader.classList.contains('sticked')) {
      offset = document.querySelector('#header.sticked').offsetHeight;
    } else if (selectHeader.hasAttribute('data-scrollto-offset')) {
      offset = selectHeader.offsetHeight - parseInt(selectHeader.getAttribute('data-scrollto-offset'));
    }
    window.scrollTo({
      top: document.querySelector(el).offsetTop - offset,
      behavior: 'smooth'
    });
  }




  /**
   * Fires the scrollto function on click to links .scrollto
   */
  let selectScrollto = document.querySelectorAll('.scrollto');
  selectScrollto.forEach(el => el.addEventListener('click', function(event) {
    if (document.querySelector(this.hash)) {
      event.preventDefault();

      let mobileNavActive = document.querySelector('.mobile-nav-active');
      if (mobileNavActive) {
        mobileNavActive.classList.remove('mobile-nav-active');

        let navbarToggle = document.querySelector('.mobile-nav-toggle');
        navbarToggle.classList.toggle('bi-list');
        navbarToggle.classList.toggle('bi-x');
      }
      scrollto(this.hash);
    }
  }));

  /**
   * Scroll with ofset on page load with hash links in the url
   */
  window.addEventListener('load', () => {
    if (window.location.hash) {
      if (document.querySelector(window.location.hash)) {
        scrollto(window.location.hash);
      }
    }
  });

  /**
   * Mobile nav toggle
   */
  const mobileNavToogle = document.querySelector('.mobile-nav-toggle');
  if (mobileNavToogle) {
    mobileNavToogle.addEventListener('click', function(event) {
      event.preventDefault();

      document.querySelector('body').classList.toggle('mobile-nav-active');

      this.classList.toggle('bi-list');
      this.classList.toggle('bi-x');
    });
  }

  /**
   * Toggle mobile nav dropdowns
   */
  const navDropdowns = document.querySelectorAll('.navbar .dropdown > a');

  navDropdowns.forEach(el => {
    el.addEventListener('click', function(event) {
      if (document.querySelector('.mobile-nav-active')) {
        event.preventDefault();
        this.classList.toggle('active');
        this.nextElementSibling.classList.toggle('dropdown-active');

        let dropDownIndicator = this.querySelector('.dropdown-indicator');
        dropDownIndicator.classList.toggle('bi-chevron-up');
        dropDownIndicator.classList.toggle('bi-chevron-down');
      }
    })
  });

  /**
   * Auto generate the hero carousel indicators
   */
  let heroCarouselIndicators = document.querySelector('#hero .carousel-indicators');
  if (heroCarouselIndicators) {
    let heroCarouselItems = document.querySelectorAll('#hero .carousel-item')

    heroCarouselItems.forEach((item, index) => {
      if (index === 0) {
        heroCarouselIndicators.innerHTML += `<li data-bs-target="#hero" data-bs-slide-to="${index}" class="active"></li>`;
      } else {
        heroCarouselIndicators.innerHTML += `<li data-bs-target="#hero" data-bs-slide-to="${index}"></li>`;
      }
    });
  }

  /**
   * Scroll top button
   */
  const scrollTop = document.querySelector('.scroll-top');
  if (scrollTop) {
    const togglescrollTop = function() {
      window.scrollY > 100 ? scrollTop.classList.add('active') : scrollTop.classList.remove('active');
    }
    window.addEventListener('load', togglescrollTop);
    document.addEventListener('scroll', togglescrollTop);
    scrollTop.addEventListener('click', window.scrollTo({
      top: 0,
      behavior: 'smooth'
    }));
  }

  /**
   * Initiate glightbox
   */
  const glightbox = GLightbox({
    selector: '.glightbox'
  });

  /**
   * Porfolio isotope and filter
   */
  let portfolionIsotope = document.querySelector('.portfolio-isotope');

  if (portfolionIsotope) {

    let portfolioFilter = portfolionIsotope.getAttribute('data-portfolio-filter') ? portfolionIsotope.getAttribute('data-portfolio-filter') : '*';
    let portfolioLayout = portfolionIsotope.getAttribute('data-portfolio-layout') ? portfolionIsotope.getAttribute('data-portfolio-layout') : 'masonry';
    let portfolioSort = portfolionIsotope.getAttribute('data-portfolio-sort') ? portfolionIsotope.getAttribute('data-portfolio-sort') : 'original-order';

    window.addEventListener('load', () => {
      let portfolioIsotope = new Isotope(document.querySelector('.portfolio-container'), {
        itemSelector: '.portfolio-item',
        layoutMode: portfolioLayout,
        filter: portfolioFilter,
        sortBy: portfolioSort
      });

      let menuFilters = document.querySelectorAll('.portfolio-isotope .portfolio-flters li');
      menuFilters.forEach(function(el) {
        el.addEventListener('click', function() {
          document.querySelector('.portfolio-isotope .portfolio-flters .filter-active').classList.remove('filter-active');
          this.classList.add('filter-active');
          portfolioIsotope.arrange({
            filter: this.getAttribute('data-filter')
          });
          if (typeof aos_init === 'function') {
            aos_init();
          }
        }, false);
      });

    });

  }

  /**
   * Clients Slider
   */
  new Swiper('.clients-slider', {
    speed: 400,
    loop: true,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false
    },
    slidesPerView: 'auto',
    breakpoints: {
      320: {
        slidesPerView: 2,
        spaceBetween: 40
      },
      480: {
        slidesPerView: 3,
        spaceBetween: 60
      },
      640: {
        slidesPerView: 4,
        spaceBetween: 80
      },
      992: {
        slidesPerView: 6,
        spaceBetween: 120
      }
    }
  });


  /**
   * Testimonials Slider
   */
  new Swiper('.testimonials-slider', {
    speed: 600,
    loop: true,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false
    },
    slidesPerView: 'auto',
    pagination: {
      el: '.swiper-pagination',
      type: 'bullets',
      clickable: true
    }
  });

  /**
   * Testimonials Slider
   */
  new Swiper('.portfolio-details-slider', {
    speed: 600,
    loop: true,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false
    },
    slidesPerView: 'auto',
    pagination: {
      el: '.swiper-pagination',
      type: 'bullets',
      clickable: true
    }
  });

  /**
   * Animation on scroll function and init
   */
  function aos_init() {
    AOS.init({
      duration: 1000,
      easing: 'ease-in-out',
      once: true,
      mirror: false
    });
  }
  window.addEventListener('load', () => {
    aos_init();
  });


  var updatedProfilePhotoElement = document.querySelector('.profile-photo');
  if (updatedProfilePhotoElement) {
    updatedProfilePhotoElement.addEventListener('click', handleDropdownToggle);

    window.addEventListener('click', function(event) {
      if (!event.target.matches('.profile-photo')) {
        closeAllDropdowns();
      }
    });
  }

  function handleDropdownToggle() {
    var updatedDropdownContent = document.querySelector('.profile-dropdown-content');
    if (updatedDropdownContent.classList.contains('show')) {
      updatedDropdownContent.classList.remove('show');
    } else {
      updatedDropdownContent.classList.add('show');
    }
  }

  function closeAllDropdowns() {
    var updatedDropdownContents = document.querySelectorAll('.profile-dropdown-content');
    updatedDropdownContents.forEach(function(dropdown) {
      dropdown.classList.remove('show');
    });
  }


  /**
   * Ban And Delete Buttons Behaviour for Admin Dashboard
    */

  let dropdowns = document.querySelectorAll('.ban-dropdown');

  dropdowns.forEach((dropdown) => {
    let btn = dropdown.querySelector('.ban-btn');
    let menu = dropdown.querySelector('.ban-menu');

    btn.addEventListener('click', () => {
      menu.style.display = menu.style.display === 'none' || !menu.style.display ? 'block' : 'none';
    });

    // Optionally: Close the dropdown if clicked outside
    window.addEventListener('click', (event) => {
      if (!dropdown.contains(event.target)) {
        menu.style.display = 'none';
      }
    });
  });


  /**
   * Add Student Button Behavior
    */

      // Reference to the "Add Student" button and modal
  const addStudentButton = document.querySelector('.btn-add-student');
  const addStudentModal = document.getElementById('addStudentModal');
  const closeModal = document.querySelector('.close');
  const studentForm = document.getElementById('studentForm');
  const studentsTable = document.getElementById('studentsTable').getElementsByTagName('tbody')[0];

  if (addStudentButton && addStudentModal && closeModal && studentForm && studentsTable) {

    // Event listener for opening the modal
    addStudentButton.addEventListener('click', () => {
      addStudentModal.style.display = 'block';
    });

    // Event listener for closing the modal
    closeModal.addEventListener('click', () => {
      addStudentModal.style.display = 'none';
    });

    // Optionally, close the modal when clicking outside of it
    window.addEventListener('click', (event) => {
      if (event.target === addStudentModal) {
        addStudentModal.style.display = 'none';
      }
    });

    // Add a new student to the table upon form submission
    studentForm.addEventListener('submit', function(event) {
      event.preventDefault();

      let name = this.querySelector('#name').value;
      let email = this.querySelector('#email').value;
      let avatar = this.querySelector('#avatar').files[0];
      let cv = this.querySelector('#cv').files[0];

      // For simplicity, I'm assuming a fixed date for now. You can update as needed.
      let joinDate = '01-01-2023';
      let lastActivity = '10-10-2023';

      let newRow = studentsTable.insertRow();

      // Avatar column
      let avatarCell = newRow.insertCell(0);
      let imgElement = document.createElement('img');
      imgElement.src = URL.createObjectURL(avatar);
      imgElement.width = 50;
      imgElement.alt = "Avatar";
      avatarCell.appendChild(imgElement);

      // Other columns
      newRow.insertCell(1).textContent = email;
      newRow.insertCell(2).textContent = name;

      // CV column
      let cvCell = newRow.insertCell(3);
      let cvLink = document.createElement('a');
      cvLink.href = URL.createObjectURL(cv);
      cvLink.textContent = "View CV";
      cvLink.target = "_blank";
      cvCell.appendChild(cvLink);

      newRow.insertCell(4).textContent = joinDate;
      newRow.insertCell(5).textContent = lastActivity;

      // Action buttons
      // Action buttons
      let actionCell = newRow.insertCell(6);

// Ban button with dropdown
      let banDiv = document.createElement('div');
      banDiv.classList.add('ban-dropdown');

      let banButton = document.createElement('button');
      banButton.classList.add('btn-action', 'ban-btn');
      banButton.textContent = 'Ban';
      banDiv.appendChild(banButton);

      let banMenu = document.createElement('div');
      banMenu.classList.add('ban-menu');

      let banOptions = ['1 Hour', '1 Day', '1 Week', '1 Month', '1 Year', 'Forever'];
      banOptions.forEach(option => {
        let anchor = document.createElement('a');
        anchor.href = '#';
        anchor.textContent = option;
        banMenu.appendChild(anchor);
      });

      banDiv.appendChild(banMenu);
      actionCell.appendChild(banDiv);

// Delete button
      let deleteButton = document.createElement('button');
      deleteButton.classList.add('btn-action', 'delete-btn');
      deleteButton.textContent = 'Delete';
      actionCell.appendChild(deleteButton);


      // Reset the form and close the modal
      studentForm.reset();
      addStudentModal.style.display = 'none';
    });

  }


  /**
   * Delete Button Behaviour
   */


  // Check if the studentsTable exists
  if (studentsTable) {
    // Add the event listener to the studentsTable for the delete buttons
    studentsTable.addEventListener('click', function(event) {
      if (event.target.classList.contains('delete-btn')) {
        let rowToDelete = event.target.closest('tr');
        if (rowToDelete) {
          rowToDelete.remove();
        }
      }
    });
  } else {
    console.error('studentsTable not found!');
  }
























});

/**
 * Validation Form when sending the CV to us
 */
function validateForm() {
  let firstName = document.getElementsByName("first-name")[0].value;
  let lastName = document.getElementsByName("last-name")[0].value;
  let email = document.getElementsByName("email")[0].value;
  let cv = document.getElementsByName("cv")[0].value;

  let firstNameError = document.getElementById("first-name-error");
  let lastNameError = document.getElementById("last-name-error");
  let emailError = document.getElementById("email-error");
  let cvError = document.getElementById("cv-error");

  firstNameError.textContent = validateField(firstName, "First Name");
  lastNameError.textContent = validateField(lastName, "Last Name");
  emailError.textContent = validateField(email, "Email");
  cvError.textContent = validateField(cv, "CV");

  // Check if any error messages are present
  if (firstNameError.textContent || lastNameError.textContent || emailError.textContent || cvError.textContent) {
    return false; // Form submission is prevented
  }

  return true; // Form submission is allowed
}

function validateField(value, fieldName) {
  if (value.trim() === "") {
    return `Please enter your ${fieldName}.`;
  }
  return "";
}





/**
 * Adaugarea Tagurilor in Sectiunea Lor
 */
const searchInput = document.getElementById("search-input");
const tagsList = document.getElementById("tags-list");

searchInput.addEventListener("keydown", function(event) {
  if (event.key === "Enter") {
    event.preventDefault();
    const searchQuery = searchInput.value.trim();
    if (searchQuery !== "") {
      const tagItem = document.createElement("li");
      tagItem.innerHTML = `<a href="#">${searchQuery}</a>`;
      tagsList.appendChild(tagItem);
      searchInput.value = ""; // Clear the input field
    }
  }
});
/**
 * Adaugarea Tagurilor in Sectiunea Lor
 */

let currentRating = 0;

function rateInternship(rating) {
  currentRating = rating;
  highlightStars(rating);
  // You can send the rating to your server or perform other actions here.
}

/**
 * Stelutele se fac galbene
 */
function highlightStars(rating) {
  for (let i = 1; i <= 5; i++) {
    const star = document.getElementById(`star${i}`);
    if (i <= rating) {
      star.style.color = "gold"; // Highlighted (yellow) star
    } else {
      star.style.color = "gray"; // Unhighlighted (gray) star
    }
  }
}

/**
 * Functia review
 */
function postReview() {
  // Add your code to handle the "Post" button action here.
}

/**
 * Admin Dashboard Table
 */
function toggleStudentsTable() {
  var img = document.querySelector("#hero-animated img");
  var table = document.getElementById("studentsTable");

  if (table.style.display === "none") {
    img.style.display = "none";
    table.style.display = "table";
  } else {
    img.style.display = "block";
    table.style.display = "none";
  }
}





/*
      User Profile Page, updating the avatar and the basic info
 */

function changeAvatar() {
  // Function to change the avatar, e.g., open a file input dialog
}


function toggleEdit() {
  const profileName = document.getElementById('profileName');
  const profileInfo = document.getElementById('profileInfo');
  const editButton = document.getElementById('editButton');

  if (isEditable) {
    // Save the changes (this can also be where you send changes to your backend)
    const name = profileName.innerText;
    const info = profileInfo.innerText;
    // Save the name and info to your backend or local storage here
    // For now, it just remains in the page without any backend saving.

    // Make the content non-editable
    profileName.contentEditable = "false";
    profileInfo.contentEditable = "false";

    // Change button text back to Edit
    editButton.innerText = "Edit Information";

  } else {
    // Make the content editable
    profileName.contentEditable = "true";
    profileInfo.contentEditable = "true";

    // Change button text to Save Changes
    editButton.innerText = "Save Changes";
  }

  // Toggle the isEditable flag
  isEditable = !isEditable;
}



function triggerFileInput() {
  document.getElementById('avatarInput').click();
}

function updateAvatar() {
  const input = document.getElementById('avatarInput');
  if (input.files && input.files[0]) {
    const reader = new FileReader();
    reader.onload = function (e) {
      document.getElementById('avatarImage').src = e.target.result;
    }
    reader.readAsDataURL(input.files[0]);
  }
}



function toggleEditable() {
  var profileName = document.getElementById("profileName");
  var profileInfo = document.getElementById("profileInfo");

  var isEditable = profileName.getAttribute("contenteditable");

  if (isEditable === "true") {
    profileName.setAttribute("contenteditable", "false");
    profileInfo.setAttribute("contenteditable", "false");
  } else {
    profileName.setAttribute("contenteditable", "true");
    profileInfo.setAttribute("contenteditable", "true");
    profileName.focus();  // This will set the focus to the name field for immediate editing
  }
}



/*
The links section on the user profile page
 */


function addLink() {
  // Prompt the user to enter a link URL
  const linkURL = prompt("Enter the link URL:");

  if (linkURL) {
    // Create a new link container
    const linkContainer = document.createElement("div");
    linkContainer.className = "d-flex align-items-center mt-2";

    // Create an icon for the new link
    const linkIcon = document.createElement("i");
    linkIcon.className = "bi bi-globe";
    linkIcon.style.fontSize = "1.5rem";

    // Create an anchor element for the URL
    const linkAnchor = document.createElement("a");
    linkAnchor.href = linkURL;
    linkAnchor.className = "ms-2";
    linkAnchor.textContent = "Link"; // Display "Link" as the link name

    // Append the icon and anchor element to the link container
    linkContainer.appendChild(linkIcon);
    linkContainer.appendChild(linkAnchor);

    // Append the link container to the socialLinks div
    const socialLinks = document.getElementById("socialLinks");
    socialLinks.appendChild(linkContainer);
  }
}













