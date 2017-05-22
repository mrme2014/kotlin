package com.mrs.kotlin

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by mrs on 2017/5/22.
 */
abstract class BaseListAdapter<T>(var datas: ArrayList<T>?, var context: Context) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return absGetView(position, convertView, parent);
    }

    override fun getItem(position: Int): Any {
        return datas!!.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        if (datas == null)
            return 0;
        return datas!!.size;
    }

    abstract fun absGetView(position: Int, convertView: View?, parent: ViewGroup?): View;
}