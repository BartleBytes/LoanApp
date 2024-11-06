package com.example.criminalintent

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test

class CrimeDetailFragmentTest {

    @Test
    fun testFragmentViewIsDisplayed() {
        // Launch the fragment in a container
        launchFragmentInContainer<CrimeDetailFragment>()

        // Check if the crimeTitle EditText is displayed (a basic UI element)
        onView(withId(R.id.crime_title)).check(matches(isDisplayed()))
    }
}