scratch-webcomponents
=====================

What are Webcomponents? Well.. many things. At the highest level they allow the ability to create custom HTML tags. At
a slightly lower level they encapsulate a number of new HTML technologies that when used together provide a way to write 
custom HTML tags. So what are these new technologies?
 
### [Custom Elements](https://w3c.github.io/webcomponents/spec/custom/)

This is the core to writing custom tags, it allows you, with JavaScript, to register a new custom tag with it's own 
behaviour.

### [HTML imports](https://w3c.github.io/webcomponents/spec/imports/)

It is now finally possible to import HTML into HTML. Something that has been conspicuously absent from the 
beginning. Strangely we have been able to import CSS and JavaScript into HTML for a long time, but not HTML it's self.
Now obviously it would be possible to import pure JavaScript custom tags without this, but building HTML in pure 
JavaScript isn't the most pleasant experience. Writing HTML in HTML is far more preferable, HTML imports then allows you 
to import custom tags that have been written with a combination of HTML and JavaScript.

### [HTML Template](https://html.spec.whatwg.org/multipage/scripting.html#the-template-element/)

Another technology that has been missing from HTML is the ability to define reusable fragments of HTML that aren't 
rendered until they're needed. This technology is oddly named "HTML Templates", where a better name might have 
been "HTML Fragments". The implication of this is that reusable HTML fragments can be created and contained within the 
HTML without any of their resources (e.g. images, CSS, video) being requested. The contents of the template will only be
requested when it has been added to the DOM. This of course then enables the creation of webcomponent libraries that can 
be imported with minimal impact on the weight of the web page.

### [Shadow DOM](https://w3c.github.io/webcomponents/spec/shadow/)

The shadow DOM provides HTML with the concept of encapsulation. Until now everything in an HTML document has been 
global. That is any element or CSS style has been accessible to and applied to the entire document. Now with the shadow 
DOM elements and CSS will not be accessible or applied to the host DOM. This means that custom element CSS will not leak 
out to the host page, also the host page will not be able to override the CSS of the custom element with CSS selectors.

##### Intellij Hot Loading

It is possible to configure Intellij so that it will hot load the static files in this project while it is running the 
Spring Boot application. To do this follow the instructions at 
[this link](http://garywaddell.com/2015/11/20/spring-boot-intellij-idea-not-reloading-static-content/).