package com.rappi.rappitest.DAL;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.rappi.rappitest.Models.*;
import ir.royapajoohesh.dataLibs.TableBase;

import java.util.ArrayList;

/**
 * Created by Dr TJ on February 2017.
 */
public class RedditDataDataSource {
	public static String TAG = "RedditDataDataSource";

    SQLiteDatabase database;
    RedditDataOpenHelper dbHelper;
	Context context;

    public static String[] AllColumns = {
        "1 as _id",
		"id",
		"banner_img",
		"user_sr_theme_enabled",
		"submit_text_html",
		"wiki_enabled",
		"show_media",
		"submit_text",
		"display_name",
		"header_img",
		"description_html",
		"title",
		"collapse_deleted_comments",
		"over18",
		"public_description_html",
		"spoilers_enabled",
		"icon_size_width",
		"icon_size_height",
		"icon_img",
		"header_title",
		"description",
		"public_traffic",
		"header_size_width",
		"header_size_height",
		"subscribers",
		"submit_text_label",
		"lang",
		"key_color",
		"name",
		"created",
		"url",
		"quarantine",
		"hide_ads",
		"created_utc",
		"banner_size_width",
		"banner_size_height",
		"advertiser_category",
		"public_description",
		"show_media_preview",
		"comment_score_hide_mins",
		"subreddit_type",
		"submission_type"
    };

    public RedditDataDataSource(Context context){
        this.dbHelper = new RedditDataOpenHelper(context);
		this.context = context;
    }

    public void Open(){
        this.database = dbHelper.getWritableDatabase();

		if (!TableBase.Exists(this.database, RedditDataOpenHelper.TableName)){
			this.dbHelper.onCreate(this.database);
		}
    }

    public void Close(){
		this.database.close();
        dbHelper.close();
    }

    public RedditData Insert(RedditData newRedditDataValues, Boolean overwriteExisting){
        if(this.IsDuplicate(newRedditDataValues.id)) {
        	if(overwriteExisting)
        		return Update(newRedditDataValues);
        	else
        		return GetItem(newRedditDataValues.id);
        }
    	
		ContentValues values = new ContentValues();

        values.put("id", newRedditDataValues.id);
		values.put("banner_img", newRedditDataValues.banner_img);
		values.put("user_sr_theme_enabled", newRedditDataValues.user_sr_theme_enabled);
		values.put("submit_text_html", newRedditDataValues.submit_text_html);
		values.put("wiki_enabled", newRedditDataValues.wiki_enabled);
		values.put("show_media", newRedditDataValues.show_media);
		values.put("submit_text", newRedditDataValues.submit_text);
		values.put("display_name", newRedditDataValues.display_name);
		values.put("header_img", newRedditDataValues.header_img);
		values.put("description_html", newRedditDataValues.description_html);
		values.put("title", newRedditDataValues.title);
		values.put("collapse_deleted_comments", newRedditDataValues.collapse_deleted_comments);
		values.put("over18", newRedditDataValues.over18);
		values.put("public_description_html", newRedditDataValues.public_description_html);
		values.put("spoilers_enabled", newRedditDataValues.spoilers_enabled);
		values.put("icon_size_width", newRedditDataValues.icon_size_width);
		values.put("icon_size_height", newRedditDataValues.icon_size_height);
		values.put("icon_img", newRedditDataValues.icon_img);
		values.put("header_title", newRedditDataValues.header_title);
		values.put("description", newRedditDataValues.description);
		values.put("public_traffic", newRedditDataValues.public_traffic);
		values.put("header_size_width", newRedditDataValues.header_size_width);
		values.put("header_size_height", newRedditDataValues.header_size_height);
		values.put("subscribers", newRedditDataValues.subscribers);
		values.put("submit_text_label", newRedditDataValues.submit_text_label);
		values.put("lang", newRedditDataValues.lang);
		values.put("key_color", newRedditDataValues.key_color);
		values.put("name", newRedditDataValues.name);
		values.put("created", newRedditDataValues.created);
		values.put("url", newRedditDataValues.url);
		values.put("quarantine", newRedditDataValues.quarantine);
		values.put("hide_ads", newRedditDataValues.hide_ads);
		values.put("created_utc", newRedditDataValues.created_utc);
		values.put("banner_size_width", newRedditDataValues.banner_size_width);
		values.put("banner_size_height", newRedditDataValues.banner_size_height);
		values.put("advertiser_category", newRedditDataValues.advertiser_category);
		values.put("public_description", newRedditDataValues.public_description);
		values.put("show_media_preview", newRedditDataValues.show_media_preview);
		values.put("comment_score_hide_mins", newRedditDataValues.comment_score_hide_mins);
		values.put("subreddit_type", newRedditDataValues.subreddit_type);
		values.put("submission_type", newRedditDataValues.submission_type);

        this.database.insert(RedditDataOpenHelper.TableName, null, values);
        return newRedditDataValues;
    }

    public RedditData Update(RedditData newRedditDataValues){
        ContentValues values = new ContentValues();

		values.put("banner_img", newRedditDataValues.banner_img);
		values.put("user_sr_theme_enabled", newRedditDataValues.user_sr_theme_enabled);
		values.put("submit_text_html", newRedditDataValues.submit_text_html);
		values.put("wiki_enabled", newRedditDataValues.wiki_enabled);
		values.put("show_media", newRedditDataValues.show_media);
		values.put("submit_text", newRedditDataValues.submit_text);
		values.put("display_name", newRedditDataValues.display_name);
		values.put("header_img", newRedditDataValues.header_img);
		values.put("description_html", newRedditDataValues.description_html);
		values.put("title", newRedditDataValues.title);
		values.put("collapse_deleted_comments", newRedditDataValues.collapse_deleted_comments);
		values.put("over18", newRedditDataValues.over18);
		values.put("public_description_html", newRedditDataValues.public_description_html);
		values.put("spoilers_enabled", newRedditDataValues.spoilers_enabled);
		values.put("icon_size_width", newRedditDataValues.icon_size_width);
		values.put("icon_size_height", newRedditDataValues.icon_size_height);
		values.put("icon_img", newRedditDataValues.icon_img);
		values.put("header_title", newRedditDataValues.header_title);
		values.put("description", newRedditDataValues.description);
		values.put("public_traffic", newRedditDataValues.public_traffic);
		values.put("header_size_width", newRedditDataValues.header_size_width);
		values.put("header_size_height", newRedditDataValues.header_size_height);
		values.put("subscribers", newRedditDataValues.subscribers);
		values.put("submit_text_label", newRedditDataValues.submit_text_label);
		values.put("lang", newRedditDataValues.lang);
		values.put("key_color", newRedditDataValues.key_color);
		values.put("name", newRedditDataValues.name);
		values.put("created", newRedditDataValues.created);
		values.put("url", newRedditDataValues.url);
		values.put("quarantine", newRedditDataValues.quarantine);
		values.put("hide_ads", newRedditDataValues.hide_ads);
		values.put("created_utc", newRedditDataValues.created_utc);
		values.put("banner_size_width", newRedditDataValues.banner_size_width);
		values.put("banner_size_height", newRedditDataValues.banner_size_height);
		values.put("advertiser_category", newRedditDataValues.advertiser_category);
		values.put("public_description", newRedditDataValues.public_description);
		values.put("show_media_preview", newRedditDataValues.show_media_preview);
		values.put("comment_score_hide_mins", newRedditDataValues.comment_score_hide_mins);
		values.put("subreddit_type", newRedditDataValues.subreddit_type);
		values.put("submission_type", newRedditDataValues.submission_type);

        String whereArgs[] = new String[1];
        whereArgs[0] = newRedditDataValues.id;

        this.database.update(RedditDataOpenHelper.TableName, values, "id = ?", whereArgs);
        return newRedditDataValues;
    }

    public int Delete(String id){
        String whereArgs[] = new String[1];
        whereArgs[0] = id;

        return this.database.delete(RedditDataOpenHelper.TableName, "id = ?", whereArgs);
    }

	public Cursor SelectAllAsCursor() {
        Cursor cursor = this.database.query(RedditDataOpenHelper.TableName, RedditDataDataSource.AllColumns, null, null, null, null, null);
        return cursor;
    }

    public ArrayList<RedditData> SelectAll(){
        ArrayList<RedditData> res = new ArrayList<RedditData>();
        Cursor cursor = this.database.query(RedditDataOpenHelper.TableName, RedditDataDataSource.AllColumns, null, null, null, null, null);
        if(cursor.getCount() > 0){
            while (cursor.moveToNext()) {
				RedditData item = RedditData.FromCursor(cursor);
            	
				res.add(item);
            }
        }

		cursor.close();
        return res;
    }

    public ArrayList<RedditData> Select(String whereClause, String orderByClause){
        ArrayList<RedditData> res = new ArrayList<RedditData>();
        Cursor cursor = this.database.query(RedditDataOpenHelper.TableName, RedditDataDataSource.AllColumns, whereClause, null, null, null, orderByClause);

        if(cursor.getCount() > 0){
            while (cursor.moveToNext()) {
				RedditData item = RedditData.FromCursor(cursor);
            	res.add(item);
			}
        }

		cursor.close();
        return res;
    }

    public void ReplaceRows(ArrayList<RedditData> res) {
        if (TableBase.Exists(this.database, RedditDataOpenHelper.TableName) == false){
			this.dbHelper.onCreate(this.database);
		}
		
		// clear all rows
		this.database.delete(RedditDataOpenHelper.TableName, null, null);

		// add new one
        for (RedditData item : res) {
            Insert(item, true);
        }
    }

	public Boolean IsDuplicate(String id) {
        String whereArgs[] = new String[1];
        whereArgs[0] = id;

		if(!TableBase.Exists(this.database, RedditDataOpenHelper.TableName))
			return false;

        Cursor cursor = this.database.query(RedditDataOpenHelper.TableName, RedditDataDataSource.AllColumns, "id = ?", whereArgs, null, null, null);
        int count = cursor.getCount();
		cursor.close();

		return count > 0;	
	}

	public RedditData GetItem(String id){
        String whereArgs[] = new String[1];
        whereArgs[0] = id;

        Cursor cursor = this.database.query(RedditDataOpenHelper.TableName, RedditDataDataSource.AllColumns, "id = ?", whereArgs, null, null, null);
		
		RedditData res = cursor.moveToNext() ? RedditData.FromCursor(cursor) : null;

		cursor.close();
		return res;
	}

	public static void Insert(Context context, RedditData newItem) {
		RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
		dsRedditData.Open();
		dsRedditData.Insert(newItem, true);
		dsRedditData.Close();
	}

	public static void DeleteAll(Context context) {
		RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
		
		if (!TableBase.Exists(dsRedditData.database, RedditDataOpenHelper.TableName))
			return;

		dsRedditData.Open();
		dsRedditData.database.delete(RedditDataOpenHelper.TableName, null, null);
		dsRedditData.Close();
	}

	public static int GetCount(Context context) {
		RedditDataDataSource dsRedditData = new RedditDataDataSource(context);
		
		dsRedditData.Open();
		int res = dsRedditData.SelectAll().size();
		dsRedditData.Close();

		return res;
	}
}