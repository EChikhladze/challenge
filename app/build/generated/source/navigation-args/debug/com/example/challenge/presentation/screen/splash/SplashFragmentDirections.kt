package com.example.challenge.presentation.screen.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.challenge.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToLogInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_logInFragment)

    public fun actionSplashFragmentToConnectionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_connectionsFragment)
  }
}
