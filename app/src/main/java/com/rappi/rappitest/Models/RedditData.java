package com.rappi.rappitest.Models;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import com.rappi.rappitest.DAL.RedditDataDataSource;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Dr TJ on February 2017.
 */
public class RedditData implements Parcelable {
	public static String TAG = "RedditData";

    public String id;
	public String banner_img;
	public String user_sr_theme_enabled;
	public String submit_text_html;
	public String wiki_enabled;
	public String show_media;
	public String submit_text;
	public String display_name;
	public String header_img;
	public String description_html;
	public String title;
	public String collapse_deleted_comments;
	public String over18;
	public String public_description_html;
	public String spoilers_enabled;
	public long icon_size_width;
	public long icon_size_height;
	public String icon_img;
	public String header_title;
	public String description;
	public String public_traffic;
	public long header_size_width;
	public long header_size_height;
	public long subscribers;
	public String submit_text_label;
	public String lang;
	public String key_color;
	public String name;
	public String created;
	public String url;
	public String quarantine;
	public String hide_ads;
	public String created_utc;
	public long banner_size_width;
	public long banner_size_height;
	public String advertiser_category;
	public String public_description;
	public String show_media_preview;
	public long comment_score_hide_mins;
	public String subreddit_type;
	public String submission_type;

	public static String Column_id = "id";
	public static String Column_banner_img = "banner_img";
	public static String Column_user_sr_theme_enabled = "user_sr_theme_enabled";
	public static String Column_submit_text_html = "submit_text_html";
	public static String Column_wiki_enabled = "wiki_enabled";
	public static String Column_show_media = "show_media";
	public static String Column_submit_text = "submit_text";
	public static String Column_display_name = "display_name";
	public static String Column_header_img = "header_img";
	public static String Column_description_html = "description_html";
	public static String Column_title = "title";
	public static String Column_collapse_deleted_comments = "collapse_deleted_comments";
	public static String Column_over18 = "over18";
	public static String Column_public_description_html = "public_description_html";
	public static String Column_spoilers_enabled = "spoilers_enabled";
	public static String Column_icon_size_width = "icon_size_width";
	public static String Column_icon_size_height = "icon_size_height";
	public static String Column_icon_img = "icon_img";
	public static String Column_header_title = "header_title";
	public static String Column_description = "description";
	public static String Column_public_traffic = "public_traffic";
	public static String Column_header_size_width = "header_size_width";
	public static String Column_header_size_height = "header_size_height";
	public static String Column_subscribers = "subscribers";
	public static String Column_submit_text_label = "submit_text_label";
	public static String Column_lang = "lang";
	public static String Column_key_color = "key_color";
	public static String Column_name = "name";
	public static String Column_created = "created";
	public static String Column_url = "url";
	public static String Column_quarantine = "quarantine";
	public static String Column_hide_ads = "hide_ads";
	public static String Column_created_utc = "created_utc";
	public static String Column_banner_size_width = "banner_size_width";
	public static String Column_banner_size_height = "banner_size_height";
	public static String Column_advertiser_category = "advertiser_category";
	public static String Column_public_description = "public_description";
	public static String Column_show_media_preview = "show_media_preview";
	public static String Column_comment_score_hide_mins = "comment_score_hide_mins";
	public static String Column_subreddit_type = "subreddit_type";
	public static String Column_submission_type = "submission_type";

    public RedditData() { }

	public RedditData(String id, String banner_img, String user_sr_theme_enabled, String submit_text_html, String wiki_enabled, String show_media, String submit_text, String display_name, String header_img, String description_html, String title, String collapse_deleted_comments, String over18, String public_description_html, String spoilers_enabled, long icon_size_width, long icon_size_height, String icon_img, String header_title, String description, String public_traffic, long header_size_width, long header_size_height, long subscribers, String submit_text_label, String lang, String key_color, String name, String created, String url, String quarantine, String hide_ads, String created_utc, long banner_size_width, long banner_size_height, String advertiser_category, String public_description, String show_media_preview, long comment_score_hide_mins, String subreddit_type, String submission_type) { 
		this.id = id;
		this.banner_img = banner_img;
		this.user_sr_theme_enabled = user_sr_theme_enabled;
		this.submit_text_html = submit_text_html;
		this.wiki_enabled = wiki_enabled;
		this.show_media = show_media;
		this.submit_text = submit_text;
		this.display_name = display_name;
		this.header_img = header_img;
		this.description_html = description_html;
		this.title = title;
		this.collapse_deleted_comments = collapse_deleted_comments;
		this.over18 = over18;
		this.public_description_html = public_description_html;
		this.spoilers_enabled = spoilers_enabled;
		this.icon_size_width = icon_size_width;
		this.icon_size_height = icon_size_height;
		this.icon_img = icon_img;
		this.header_title = header_title;
		this.description = description;
		this.public_traffic = public_traffic;
		this.header_size_width = header_size_width;
		this.header_size_height = header_size_height;
		this.subscribers = subscribers;
		this.submit_text_label = submit_text_label;
		this.lang = lang;
		this.key_color = key_color;
		this.name = name;
		this.created = created;
		this.url = url;
		this.quarantine = quarantine;
		this.hide_ads = hide_ads;
		this.created_utc = created_utc;
		this.banner_size_width = banner_size_width;
		this.banner_size_height = banner_size_height;
		this.advertiser_category = advertiser_category;
		this.public_description = public_description;
		this.show_media_preview = show_media_preview;
		this.comment_score_hide_mins = comment_score_hide_mins;
		this.subreddit_type = subreddit_type;
		this.submission_type = submission_type;
	}

    public RedditData(Parcel in) {
        this.id = in.readString();
		this.banner_img = in.readString();
		this.user_sr_theme_enabled = in.readString();
		this.submit_text_html = in.readString();
		this.wiki_enabled = in.readString();
		this.show_media = in.readString();
		this.submit_text = in.readString();
		this.display_name = in.readString();
		this.header_img = in.readString();
		this.description_html = in.readString();
		this.title = in.readString();
		this.collapse_deleted_comments = in.readString();
		this.over18 = in.readString();
		this.public_description_html = in.readString();
		this.spoilers_enabled = in.readString();
		this.icon_size_width = in.readLong();
		this.icon_size_height = in.readLong();
		this.icon_img = in.readString();
		this.header_title = in.readString();
		this.description = in.readString();
		this.public_traffic = in.readString();
		this.header_size_width = in.readLong();
		this.header_size_height = in.readLong();
		this.subscribers = in.readLong();
		this.submit_text_label = in.readString();
		this.lang = in.readString();
		this.key_color = in.readString();
		this.name = in.readString();
		this.created = in.readString();
		this.url = in.readString();
		this.quarantine = in.readString();
		this.hide_ads = in.readString();
		this.created_utc = in.readString();
		this.banner_size_width = in.readLong();
		this.banner_size_height = in.readLong();
		this.advertiser_category = in.readString();
		this.public_description = in.readString();
		this.show_media_preview = in.readString();
		this.comment_score_hide_mins = in.readLong();
		this.subreddit_type = in.readString();
		this.submission_type = in.readString();
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
		dest.writeString(this.banner_img);
		dest.writeString(this.user_sr_theme_enabled);
		dest.writeString(this.submit_text_html);
		dest.writeString(this.wiki_enabled);
		dest.writeString(this.show_media);
		dest.writeString(this.submit_text);
		dest.writeString(this.display_name);
		dest.writeString(this.header_img);
		dest.writeString(this.description_html);
		dest.writeString(this.title);
		dest.writeString(this.collapse_deleted_comments);
		dest.writeString(this.over18);
		dest.writeString(this.public_description_html);
		dest.writeString(this.spoilers_enabled);
		dest.writeLong(this.icon_size_width);
		dest.writeLong(this.icon_size_height);
		dest.writeString(this.icon_img);
		dest.writeString(this.header_title);
		dest.writeString(this.description);
		dest.writeString(this.public_traffic);
		dest.writeLong(this.header_size_width);
		dest.writeLong(this.header_size_height);
		dest.writeLong(this.subscribers);
		dest.writeString(this.submit_text_label);
		dest.writeString(this.lang);
		dest.writeString(this.key_color);
		dest.writeString(this.name);
		dest.writeString(this.created);
		dest.writeString(this.url);
		dest.writeString(this.quarantine);
		dest.writeString(this.hide_ads);
		dest.writeString(this.created_utc);
		dest.writeLong(this.banner_size_width);
		dest.writeLong(this.banner_size_height);
		dest.writeString(this.advertiser_category);
		dest.writeString(this.public_description);
		dest.writeString(this.show_media_preview);
		dest.writeLong(this.comment_score_hide_mins);
		dest.writeString(this.subreddit_type);
		dest.writeString(this.submission_type);
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", banner_img: " + this.banner_img + ", user_sr_theme_enabled: " + this.user_sr_theme_enabled + ", submit_text_html: " + this.submit_text_html + ", wiki_enabled: " + this.wiki_enabled + ", show_media: " + this.show_media + ", submit_text: " + this.submit_text + ", display_name: " + this.display_name + ", header_img: " + this.header_img + ", description_html: " + this.description_html + ", title: " + this.title + ", collapse_deleted_comments: " + this.collapse_deleted_comments + ", over18: " + this.over18 + ", public_description_html: " + this.public_description_html + ", spoilers_enabled: " + this.spoilers_enabled + ", icon_size_width: " + this.icon_size_width + ", icon_size_height: " + this.icon_size_height + ", icon_img: " + this.icon_img + ", header_title: " + this.header_title + ", description: " + this.description + ", public_traffic: " + this.public_traffic + ", header_size_width: " + this.header_size_width + ", header_size_height: " + this.header_size_height + ", subscribers: " + this.subscribers + ", submit_text_label: " + this.submit_text_label + ", lang: " + this.lang + ", key_color: " + this.key_color + ", name: " + this.name + ", created: " + this.created + ", url: " + this.url + ", quarantine: " + this.quarantine + ", hide_ads: " + this.hide_ads + ", created_utc: " + this.created_utc + ", banner_size_width: " + this.banner_size_width + ", banner_size_height: " + this.banner_size_height + ", advertiser_category: " + this.advertiser_category + ", public_description: " + this.public_description + ", show_media_preview: " + this.show_media_preview + ", comment_score_hide_mins: " + this.comment_score_hide_mins + ", subreddit_type: " + this.subreddit_type + ", submission_type: " + this.submission_type;
    }

    public static final Parcelable.Creator<RedditData> CREATOR = new Creator<RedditData>() {
        @Override
        public RedditData[] newArray(int size) {
            return new RedditData[size];
        }

        @Override
        public RedditData createFromParcel(Parcel source) {
            return new RedditData(source);
        }
    };


    // static methods
    public static RedditData FromJSon(JSONObject jsonItem) throws JSONException {
        RedditData res = new RedditData();

        res.id = jsonItem.getString("id");
		res.banner_img = jsonItem.getString("banner_img");
		res.user_sr_theme_enabled = jsonItem.getString("user_sr_theme_enabled");
		res.submit_text_html = jsonItem.getString("submit_text_html");
		res.wiki_enabled = jsonItem.getString("wiki_enabled");
		res.show_media = jsonItem.getString("show_media");
		res.submit_text = jsonItem.getString("submit_text");
		res.display_name = jsonItem.getString("display_name");
		res.header_img = jsonItem.getString("header_img");
		res.description_html = jsonItem.getString("description_html");
		res.title = jsonItem.getString("title");
		res.collapse_deleted_comments = jsonItem.getString("collapse_deleted_comments");
		res.over18 = jsonItem.getString("over18");
		res.public_description_html = jsonItem.getString("public_description_html");
		res.spoilers_enabled = jsonItem.getString("spoilers_enabled");
		res.icon_size_width = jsonItem.getLong("icon_size_width");
		res.icon_size_height = jsonItem.getLong("icon_size_height");
		res.icon_img = jsonItem.getString("icon_img");
		res.header_title = jsonItem.getString("header_title");
		res.description = jsonItem.getString("description");
		res.public_traffic = jsonItem.getString("public_traffic");
		res.header_size_width = jsonItem.getLong("header_size_width");
		res.header_size_height = jsonItem.getLong("header_size_height");
		res.subscribers = jsonItem.getLong("subscribers");
		res.submit_text_label = jsonItem.getString("submit_text_label");
		res.lang = jsonItem.getString("lang");
		res.key_color = jsonItem.getString("key_color");
		res.name = jsonItem.getString("name");
		res.created = jsonItem.getString("created");
		res.url = jsonItem.getString("url");
		res.quarantine = jsonItem.getString("quarantine");
		res.hide_ads = jsonItem.getString("hide_ads");
		res.created_utc = jsonItem.getString("created_utc");
		res.banner_size_width = jsonItem.getLong("banner_size_width");
		res.banner_size_height = jsonItem.getLong("banner_size_height");
		res.advertiser_category = jsonItem.getString("advertiser_category");
		res.public_description = jsonItem.getString("public_description");
		res.show_media_preview = jsonItem.getString("show_media_preview");
		res.comment_score_hide_mins = jsonItem.getLong("comment_score_hide_mins");
		res.subreddit_type = jsonItem.getString("subreddit_type");
		res.submission_type = jsonItem.getString("submission_type");

        return res;
    }

    public static RedditData FromCursor(Cursor cursorItem) {
        RedditData res = new RedditData();

        res.id = cursorItem.getString(cursorItem.getColumnIndex("id"));
		res.banner_img = cursorItem.getString(cursorItem.getColumnIndex("banner_img"));
		res.user_sr_theme_enabled = cursorItem.getString(cursorItem.getColumnIndex("user_sr_theme_enabled"));
		res.submit_text_html = cursorItem.getString(cursorItem.getColumnIndex("submit_text_html"));
		res.wiki_enabled = cursorItem.getString(cursorItem.getColumnIndex("wiki_enabled"));
		res.show_media = cursorItem.getString(cursorItem.getColumnIndex("show_media"));
		res.submit_text = cursorItem.getString(cursorItem.getColumnIndex("submit_text"));
		res.display_name = cursorItem.getString(cursorItem.getColumnIndex("display_name"));
		res.header_img = cursorItem.getString(cursorItem.getColumnIndex("header_img"));
		res.description_html = cursorItem.getString(cursorItem.getColumnIndex("description_html"));
		res.title = cursorItem.getString(cursorItem.getColumnIndex("title"));
		res.collapse_deleted_comments = cursorItem.getString(cursorItem.getColumnIndex("collapse_deleted_comments"));
		res.over18 = cursorItem.getString(cursorItem.getColumnIndex("over18"));
		res.public_description_html = cursorItem.getString(cursorItem.getColumnIndex("public_description_html"));
		res.spoilers_enabled = cursorItem.getString(cursorItem.getColumnIndex("spoilers_enabled"));
		res.icon_size_width = cursorItem.getLong(cursorItem.getColumnIndex("icon_size_width"));
		res.icon_size_height = cursorItem.getLong(cursorItem.getColumnIndex("icon_size_height"));
		res.icon_img = cursorItem.getString(cursorItem.getColumnIndex("icon_img"));
		res.header_title = cursorItem.getString(cursorItem.getColumnIndex("header_title"));
		res.description = cursorItem.getString(cursorItem.getColumnIndex("description"));
		res.public_traffic = cursorItem.getString(cursorItem.getColumnIndex("public_traffic"));
		res.header_size_width = cursorItem.getLong(cursorItem.getColumnIndex("header_size_width"));
		res.header_size_height = cursorItem.getLong(cursorItem.getColumnIndex("header_size_height"));
		res.subscribers = cursorItem.getLong(cursorItem.getColumnIndex("subscribers"));
		res.submit_text_label = cursorItem.getString(cursorItem.getColumnIndex("submit_text_label"));
		res.lang = cursorItem.getString(cursorItem.getColumnIndex("lang"));
		res.key_color = cursorItem.getString(cursorItem.getColumnIndex("key_color"));
		res.name = cursorItem.getString(cursorItem.getColumnIndex("name"));
		res.created = cursorItem.getString(cursorItem.getColumnIndex("created"));
		res.url = cursorItem.getString(cursorItem.getColumnIndex("url"));
		res.quarantine = cursorItem.getString(cursorItem.getColumnIndex("quarantine"));
		res.hide_ads = cursorItem.getString(cursorItem.getColumnIndex("hide_ads"));
		res.created_utc = cursorItem.getString(cursorItem.getColumnIndex("created_utc"));
		res.banner_size_width = cursorItem.getLong(cursorItem.getColumnIndex("banner_size_width"));
		res.banner_size_height = cursorItem.getLong(cursorItem.getColumnIndex("banner_size_height"));
		res.advertiser_category = cursorItem.getString(cursorItem.getColumnIndex("advertiser_category"));
		res.public_description = cursorItem.getString(cursorItem.getColumnIndex("public_description"));
		res.show_media_preview = cursorItem.getString(cursorItem.getColumnIndex("show_media_preview"));
		res.comment_score_hide_mins = cursorItem.getLong(cursorItem.getColumnIndex("comment_score_hide_mins"));
		res.subreddit_type = cursorItem.getString(cursorItem.getColumnIndex("subreddit_type"));
		res.submission_type = cursorItem.getString(cursorItem.getColumnIndex("submission_type"));

        return res;
    }
	
    public static ArrayList<RedditData> Get(Context context) {
        RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
        dsRedditData.Open();
        ArrayList<RedditData> result = dsRedditData.SelectAll();
        dsRedditData.Close();

        return result;
    }

    public static void AddAll(Context context, ArrayList<RedditData> result, boolean overwriteExisting, boolean deleteExisting) {
        if (deleteExisting) {
            RedditDataDataSource.DeleteAll(context);
        }

        // add all items
        for (RedditData item : result) {
            RedditData.Add(context, item, overwriteExisting);
        }
    }

    private static void Add(Context context, RedditData item, boolean overwriteExisting) {
        RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
        dsRedditData.Open();
        dsRedditData.Insert(item, overwriteExisting);
        dsRedditData.Close();
    }

	public static void DeleteAll(Context context) {
        RedditDataDataSource.DeleteAll(context);
    }

	public static int GetCount(Context context){
        RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
        dsRedditData.Open();
        int result = dsRedditData.SelectAllAsCursor().getCount();
        dsRedditData.Close();

        return result;
    }
}
