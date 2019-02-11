# star-dance

Universal 2D graph viewer

## [Play with online demo!](https://codepen.io/Ivana-/full/BMxJPp)

## Overview

This application shows and represents any user defined or random generated graphs as a 2D diagrams.

![alt text](https://user-images.githubusercontent.com/10473034/52591087-1078e600-2e54-11e9-8df9-b54c71323805.png "Random example 1")

![alt text](https://user-images.githubusercontent.com/10473034/52591112-1d95d500-2e54-11e9-8b17-643cc4616b61.png "Random example 2")

![alt text](https://user-images.githubusercontent.com/10473034/52591122-25ee1000-2e54-11e9-9e97-48bf940920f7.png "Saint Petersburg metro")

## Setup

To get an interactive development environment run:

    lein figwheel

This will auto compile, open your default browser with projects url
and send all changes to the browser without the need to reload.
After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## License

Copyright © 2019

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
