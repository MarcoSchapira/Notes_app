package com.example.basicviewsapp

class note_object (var title: String, var body: String, var favorite: Boolean) {

    fun get_title(): String {
        return title;
    }
    fun get_body(): String {
        return body;
    }
    fun get_favorite(): Boolean {
        return favorite;
    }

    fun edit_title(new_title: String) {
        title = new_title
    }
    fun edit_body(new_body: String) {
        body = new_body
    }
    fun edit_favorite(new_favorite: Boolean) {
        favorite = new_favorite
    }


}