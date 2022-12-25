package oop_basics.dao_pattern;

import com.google.inject.Inject;
import com.google.inject.Provider;
import oop_basics.dao_pattern.GUI.CurrentUser;

public class CurrentUserProvider implements Provider<CurrentUser> {
    @Inject
    public CurrentUser get() {
        return null;
    }
}
