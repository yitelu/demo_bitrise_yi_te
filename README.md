# Demo - *Integrate Native Android App into Biterise CICD*

Author: **Yi Té Lu**

## Criteria

The following **fundamental** task completed:
* [x] Add the app by using the UI interface on the website
* [x] Achieve a green build
* [x] Show what a deployment workflow to the App Store would look like


The following **additional bonus** tasks completed:
* [x] Created Native Android App from scratch in own GitHub repository.
* [x] Created Native Espresso automation test cases
* [x] Enabled Firebase monitoring feature of Crashlytics and Performance in app.
* [x] Remote executed automation cases on Firebase Test Lab with test report generated
* [x] Automated auto deploy to Google Play Store’s production channel.


## Bitrise CICD workflow results:

The following is the **PRIMARY** workflow completed:
* [x] Connected this native Android App GitHub repository to Bitrise CICD.
* [x] Created Espresso instrumentation automation test and enabled Firebase monitoring feature of Crashlytics and Performance in app.
* [x] Android Debug Build for UI test successful
* [x] Executed Espresso automation tests in the virtual-device-testing step successful.
* [x] Test Report display in the Add-On tab with all test passed from Firebase TestLab.
* [x] Deploy to bitrise.io and got email notify the app build passed
![primary_workflow](https://user-images.githubusercontent.com/3092219/174415121-a755683d-bfb3-4fab-bca6-6296e3765f77.png)


The following is the **DEPLOY** workflow completed:
* [x] Connected this native Android App GitHub repository to Bitrise CICD.
* [x] Android Release Build is successful
* [x] Signed the app with keystore is successful.
* [x] Deploy to Google Play Store production channel successfully and got email notify the app build passed   
![deploy_workflow](https://user-images.githubusercontent.com/3092219/174415130-8a78c48e-2be6-4131-949f-28a3a406cabb.png)

## Suggestions about how to fix common issues during auto-deploy to App Store:
I’ve encountered the scenario of error failed to upload application(s): failed to upload apk, error: googleapi: Error 403: APK signature is invalid or does not exist

This is how I solved the error with my approach and my app is deployed to GooglePlayStore via the Bitrise CICD auto-deployment successfully.
1. The initial app/build.gradle config was set targetSdk 32 and then I changed to targetSdk 30
2. Originally my app was published in AAB instead of APK, the default build type is APK in Bitrise workflow Android Build, so I changed that build type to AAB
3. Then I was successfully auto deploy to GooglePlayStore production channel via Bitrise CICD 

And I’ve shared my approach of how to fix the error with the Bitrise community in following link:
https://github.com/bitrise-steplib/steps-google-play-deploy/issues/140
