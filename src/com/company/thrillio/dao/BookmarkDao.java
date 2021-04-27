package com.company.thrillio.dao;

import com.company.thrillio.DataStore;
import com.company.thrillio.entities.Bookmark;
import com.company.thrillio.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);
    }
}
