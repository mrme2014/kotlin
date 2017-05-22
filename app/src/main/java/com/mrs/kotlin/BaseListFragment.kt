package com.mrs.kotlin

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_list.view.*
import kotlinx.android.synthetic.main.fragment_list_item.view.*

/**
 * Created by mrs on 2017/5/22.
 */
class BaseListFragment : Fragment() {
    private var rootView: View? = null;
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        rootView = LayoutInflater.from(context).inflate(R.layout.fragment_list, null)
        rootView!!.listView.adapter = ListAdapter(initDatas(), context)
        return rootView
    }

    private fun initDatas(): ArrayList<String> {
        val arrayListOf = arrayListOf<String>("hello",
                "hello1",
                "hello2",
                "hello3",
                "hello4",
                "hello5",
                "hello6",
                "hello7",
                "hello8",
                "hello9",
                "hello10")
        return arrayListOf;
    }

    class ListAdapter(datas: ArrayList<String>?, context: Context) : BaseListAdapter<String>(datas, context) {
        override fun absGetView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var itemView: View
            if (convertView == null) {
                itemView = LayoutInflater.from(context).inflate(R.layout.fragment_list_item, parent, false)
            } else {
                itemView = convertView
            }
            val item = getItem(position) as String
            itemView.title.text = item + "title";
            itemView.secTitle.text = item + "sec_title"
            return itemView
        }

    }
}