# GrocerHelp-App
Common platform for community to help each other to search groceries in this pandemic period
### [Watch Demo Here 📺](https://youtu.be/nCjWVuVxNC4)

## Inspiration
It has become mandatory to wear a face mask during this pandemic period. Wearing a face mask will help prevent the individual from contracting any airborne infectious germs.
WHO advises everyone to wear ask, every time you move out to any public area. However, it’s quite common to forget. That’s where our app comes in rescue.

## What it does
Mask notifier, automatically notifies you to wear a mask every time you move out of your predefined home territory. 
Here is how it functions, 
1. After a small walkthrough, you are requested to set a Geo-Fence. Where a marker appears on the map at your current location with a predefined radius. You can adjust this radius to fit the surroundings of your home.
2. Next, you will move on to the dashboard.
3. In the dashboard, you can enable the Automatic Mask Alerts. Moreover, a small live map showing your current position in the GeoFence will be displayed.
4. So, using GeoFence you provided, every time you walk out of your home territory, you will get a notification to wear a mask. Also, all these notifications will be saved under the notifications section in the dashboard.
5. Finally, you can edit your GeoFence anytime you need, from the dashboard itself.
All these transactions will be taken place within the user’s local device there is no issue with privacy.

## How I built it
The app is built using Android Native SDK tools with the following libraries.

[Google Maps API V2](https://developers.google.com/maps/documentation)- for GeoFencing

[ButterKnife](https://jakewharton.github.io/butterknife/) - for View Binding

[Glide](https://github.com/bumptech/glide) - image loading framework for Android

[FireBase](https://firebase.google.com/) - As backend Database for storing information about various shops

[OneSignal](https://onesignal.com/) - Easy Firebase Notifications

[Alerter](https://github.com/Tapadoo/Alerter) - For Material Style Alerts

## Challenges I ran into
Initially, it has become very hard for me to establish a live location-based GeoFence. However, using Maps API provided by Google Cloud Platform it became super simple to implement all the features.

## Accomplishments that I'm proud of
It took me just 2 hours to wireframe and I was able to build the whole functional prototype within 36hours and I am proud of it.

## What I learned
I learn to implement Google Maps API v2 on Android with an active GeoFence. I also learned to implement live location detection on Android.

## What's next for Mask Notifier App
Want to make the user-interface more intuitive and launch it onto the play store so that everyone can make use of it.

