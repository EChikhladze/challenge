package com.example.challenge.presentation.screen.log_in

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.challenge.R

public class LogInFragmentDirections private constructor() {
  public companion object {
    public fun actionLogInFragmentToFriendsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_logInFragment_to_friendsFragment)
  }
}
