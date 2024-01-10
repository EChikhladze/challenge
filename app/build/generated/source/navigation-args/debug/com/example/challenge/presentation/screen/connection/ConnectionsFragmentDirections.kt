package com.example.challenge.presentation.screen.connection

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.challenge.R

public class ConnectionsFragmentDirections private constructor() {
  public companion object {
    public fun actionConnectionsFragmentToLogInFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_connectionsFragment_to_logInFragment)
  }
}
