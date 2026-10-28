# Rachel's Kota Place — Official Engineering & Operational Repository

**Student ID:** ST10513949  
**Developer:** Mogano Masechaba Rachel  
**Restaurant Headquarters:** Ga-Molepo, Polokwane, 0732  
**Live Platform Hosting:** GitHub Pages / Netlify Static Engines  

---

## Executive Project Description

Rachel's Kota Place is a vibrant local restaurant web application developed for a premier culinary enterprise operating out of Ga-Molepo. Beyond offering freshly prepared, high-quality kotas, chips, drinks, and milkshakes, the platform serves as an operational portal supporting menu ordering, bulk catering requests, event bookings, shopping cart management, and interactive customer engagement.

---

## Part 2 Revision & Lecturer Feedback Integration

Following formal grading and feedback from Part 2, the following structural and visual enhancements were incorporated:
* **Layout Consistency:** Standardized container padding, header branding, and responsive grid layouts across all primary HTML pages.
* **Semantic HTML5 Structure:** Ensured rigorous adherence to proper heading flow (`<h1>` down to `<h3>`) for improved screen reader compatibility and accessibility.
* **Cross-Browser Styling & Resilience:** Refined Baby Pink CSS color variables and media queries for seamless rendering on mobile devices, tablets, and widescreen desktop monitors.

---

## Part 3 Scope & Advanced Features

This production-grade release introduces cutting-edge web engineering features:
1. **Advanced JavaScript Interactivity & Shopping Cart:**
   * **Shopping Cart (`cart.html` & `localStorage`):** Fully operational shopping cart system allowing users to add products with custom quantities, update item counts, calculate subtotals and grand totals, remove individual items, clear the cart, and seamlessly proceed to checkout.
   * **Interactive Maps:** Leaflet.js map component embedded within `contact.html` with custom marker pinpointing the Ga-Molepo restaurant.
   * **Gallery Lightbox:** Responsive picture gallery overlay mechanism on `products.html` triggering cleanly upon user click events.
   * **Dynamic UI Polish:** Interactive tabs on `about.html` (`Who We Are`, `Our Mission`, `Our Vision`, `Our Restaurant`) and a live item search / category filter on `products.html`.
2. **Forms Architecture & Validation Layouts:**
   * **Enquiry Management (`enquiry.html`):** Tailored around restaurant operations including menu orders, bulk catering requests, event bookings, and feedback (with auto-population from cart checkout).
   * **Contact Portal (`contact.html`):** Dedicated messaging portal requiring user identifier profiles and plain-text messaging blocks.
   * **Strict Client-Side Validation:** JavaScript regex validation preventing structural null values, checking email and telephone patterns instantly.
   * **AJAX Asynchronicity (`fetch` simulation):** Asynchronous form triggers preventing browser-wide page refreshes during submittal, accompanied by responsive success toast notifications.
3. **Search Engine Optimization (SEO) & Performance:**
   * **On-Page Optimization:** Unique, descriptive `<title>` rules and meta descriptions across all pages.
   * **Technical SEO Files:** Standard `robots.txt` and master `sitemap.xml` referencing all site endpoints.
   * **Performance Tuning:** Optimized image assets, modern CSS layouts, and fast viewport configurations.

---

## Changelog / Release Tracking Log

| Version | Date | Description of Fixes & Enhancements |
| :--- | :--- | :--- |
| **v1.0** (Part 1) | 2026-03-15 | Initial HTML skeleton structure (`index.html`, `about.html`, `products.html`, `contact.html`, `enquiry.html`) and raw text content. |
| **v2.0** (Part 2) | 2026-06-20 | Implemented global CSS design system (`css/style.css`), brand color palette, and responsive grid tables. Addressed initial reviewer feedback. |
| **v3.0** (Part 3) | 2026-10-28 | Integrated Leaflet.js interactive maps, Gallery Lightbox, interactive about tabs, live product search filters, **Shopping Cart (`cart.html`) with custom quantity selectors**, Baby Pink color theme update, Ga-Molepo restaurant location updates, strict client-side form validation, AJAX asynchronous submittal, `robots.txt`, `sitemap.xml`, and academic citations. |

---

## Website Pages Suite

1. **Home (`index.html`):** Hero banner, featured kota menu showcase, Ga-Molepo restaurant highlights, and quick ordering.
2. **About Us (`about.html`):** Interactive tabbed layout detailing who we are, mission, vision, and the Ga-Molepo restaurant experience.
3. **Products (`products.html`):** Full menu catalog with quantity selectors, "Add to Cart" buttons, live search/filter bar, and responsive Lightbox gallery.
4. **Shopping Cart (`cart.html`):** Persistent shopping cart managing quantities, subtotals, grand totals, item removal, and checkout transfer to enquiry.
5. **Contact Us (`contact.html`):** Contact details, Leaflet interactive map of Ga-Molepo restaurant, and secure messaging portal.
6. **Enquiry (`enquiry.html`):** Advanced restaurant order & catering form supporting menu orders, bulk bookings, and cart checkout with AJAX submission.

---

## Project Directory Structure

```text
Web-development-mogano/
│
├── index.html
├── about.html
├── products.html
├── cart.html
├── contact.html
├── enquiry.html
├── robots.txt
├── sitemap.xml
├── README.md
├── css/
│   └── style.css
└── images/
    ├── logo.png
    ├── hero-kota.jpg
    ├── princess-kota.jpg
    ├── prince-kota.jpg
    ├── queen-kota.jpg
    ├── king-kota.jpg
    ├── empire-kota.jpg
    ├── chips.jpg
    ├── drink.jpg
    ├── milkshake.jpg
    └── ice-cream.jpg
```

---

## Academic References & Institutional Citations

1. **MDN Web Docs (Mozilla Foundation).** (2026). *HTML5 Forms, Fetch API, and Asynchronous JavaScript.* Available at: [https://developer.mozilla.org](https://developer.mozilla.org) [Accessed: October 2026].
2. **Leaflet Open-Source Mapping Library.** (2026). *Interactive JavaScript Maps Documentation.* Available at: [https://leafletjs.com](https://leafletjs.com) [Accessed: October 2026].
3. **W3C Web Accessibility Initiative.** (2026). *HTML Semantic Elements and SEO Guidelines.* Available at: [https://www.w3.org](https://www.w3.org) [Accessed: October 2026].
4. **OpenStreetMap Contributors.** (2026). *Geospatial Map Data for Polokwane and Ga-Molepo Region.* Available at: [https://www.openstreetmap.org](https://www.openstreetmap.org) [Accessed: October 2026].

---

## Copyright & Ownership

© 2026 Rachel's Kota Place. All Rights Reserved. Developed by Mogano Masechaba Rachel (ST10513949).
