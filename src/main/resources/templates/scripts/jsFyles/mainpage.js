document.addEventListener("DOMContentLoaded", function () {
    const logo = document.getElementById('logo');
    const logoContainer = document.querySelector('.logo-container');

    let scrolled = false;

    window.addEventListener('scroll', () => {
        if (window.scrollY > 0 && !scrolled) {
            logo.style.width = '151px';
            logo.style.height = '134px';
            logo.style.top = '0';
            scrolled = true;
        } else if (window.scrollY === 0 && scrolled) {

            logo.style.width = '553px';
            logo.style.height = '493px';
            logo.style.top = '50%';
            scrolled = false;
        }
    });
    logo.style.width = '553px';
    logo.style.height = '493px';
    logo.style.top = '50%';
});
