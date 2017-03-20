package com.rappi.rappitest.DAL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import ir.royapajoohesh.dataLibs.TableBase;

/**
 * Created by Dr TJ on February 2017.
 */
public class RedditDataOpenHelper extends SQLiteOpenHelper {
	public static String TAG = "RedditDataOpenHelper";

    public TableBase RedditDataTable = null;

    public static final String DatabaseName = "RappiTestData.db";
    public static final String TableName = "RedditData";
    public static final int Version = 1;

    public RedditDataOpenHelper(Context context) {
        super(context, DatabaseName, null, Version);

        this.RedditDataTable = new TableBase(DatabaseName, TableName);
        this.RedditDataTable.AddColumn("id", "TEXT", false, false);
		this.RedditDataTable.AddColumn("banner_img", "TEXT", false, false);
		this.RedditDataTable.AddColumn("user_sr_theme_enabled", "TEXT", false, false);
		this.RedditDataTable.AddColumn("submit_text_html", "TEXT", false, false);
		this.RedditDataTable.AddColumn("wiki_enabled", "TEXT", false, false);
		this.RedditDataTable.AddColumn("show_media", "TEXT", false, false);
		this.RedditDataTable.AddColumn("submit_text", "TEXT", false, false);
		this.RedditDataTable.AddColumn("display_name", "TEXT", false, false);
		this.RedditDataTable.AddColumn("header_img", "TEXT", false, false);
		this.RedditDataTable.AddColumn("description_html", "TEXT", false, false);
		this.RedditDataTable.AddColumn("title", "TEXT", false, false);
		this.RedditDataTable.AddColumn("collapse_deleted_comments", "TEXT", false, false);
		this.RedditDataTable.AddColumn("over18", "TEXT", false, false);
		this.RedditDataTable.AddColumn("public_description_html", "TEXT", false, false);
		this.RedditDataTable.AddColumn("spoilers_enabled", "TEXT", false, false);
		this.RedditDataTable.AddColumn("icon_size_width", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("icon_size_height", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("icon_img", "TEXT", false, false);
		this.RedditDataTable.AddColumn("header_title", "TEXT", false, false);
		this.RedditDataTable.AddColumn("description", "TEXT", false, false);
		this.RedditDataTable.AddColumn("public_traffic", "TEXT", false, false);
		this.RedditDataTable.AddColumn("header_size_width", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("header_size_height", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("subscribers", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("submit_text_label", "TEXT", false, false);
		this.RedditDataTable.AddColumn("lang", "TEXT", false, false);
		this.RedditDataTable.AddColumn("key_color", "TEXT", false, false);
		this.RedditDataTable.AddColumn("name", "TEXT", false, false);
		this.RedditDataTable.AddColumn("created", "TEXT", false, false);
		this.RedditDataTable.AddColumn("url", "TEXT", false, false);
		this.RedditDataTable.AddColumn("quarantine", "TEXT", false, false);
		this.RedditDataTable.AddColumn("hide_ads", "TEXT", false, false);
		this.RedditDataTable.AddColumn("created_utc", "TEXT", false, false);
		this.RedditDataTable.AddColumn("banner_size_width", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("banner_size_height", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("advertiser_category", "TEXT", false, false);
		this.RedditDataTable.AddColumn("public_description", "TEXT", false, false);
		this.RedditDataTable.AddColumn("show_media_preview", "TEXT", false, false);
		this.RedditDataTable.AddColumn("comment_score_hide_mins", "INTEGER", false, false);
		this.RedditDataTable.AddColumn("subreddit_type", "TEXT", false, false);
		this.RedditDataTable.AddColumn("submission_type", "TEXT", false, false);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String res = this.RedditDataTable.getCreateTableCommandText();
        db.execSQL(res);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String res = this.RedditDataTable.getDropTableCommandText();
        db.execSQL(res);
        this.onCreate(db);
    }
}
