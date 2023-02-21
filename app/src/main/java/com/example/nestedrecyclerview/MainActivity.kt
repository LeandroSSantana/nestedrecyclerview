package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("C", R.drawable.c))
        childItems1.add(ChildItem("C#", R.drawable.csharp))
        childItems1.add(ChildItem("Java", R.drawable.java))
        childItems1.add(ChildItem("C++", R.drawable.cplusplus))

        parentList.add(
            ParentItem(
                "Game Development",
                R.drawable.console,
                childItems1
            )
        )

        val childItems2 = ArrayList<ChildItem>()
        childItems2.add(ChildItem("Kotlin", R.drawable.kotlin))
        childItems2.add(ChildItem("XML", R.drawable.xml))
        childItems2.add(ChildItem("Java", R.drawable.java))

        parentList.add(
            ParentItem(
                "Android",
                R.drawable.android,
                childItems2
            )
        )

        val childItems3 = ArrayList<ChildItem>()
        childItems3.add(ChildItem("JavaScript", R.drawable.javascript))
        childItems3.add(ChildItem("HTML", R.drawable.html))
        childItems3.add(ChildItem("CSS", R.drawable.css))

        parentList.add(
            ParentItem(
                "Front End Web",
                R.drawable.frontend,
                childItems3
            )
        )

        val childItems4 = ArrayList<ChildItem>()
        childItems4.add(ChildItem("Julia", R.drawable.julia))
        childItems4.add(ChildItem("Python", R.drawable.python))
        childItems4.add(ChildItem("R", R.drawable.r))

        parentList.add(
            ParentItem(
                "Artificial Intelligence",
                R.drawable.ai,
                childItems4
            )
        )

        val childItems5 = ArrayList<ChildItem>()
        childItems5.add(ChildItem("Java", R.drawable.java))
        childItems5.add(ChildItem("Python", R.drawable.python))
        childItems5.add(ChildItem("PHP", R.drawable.php))
        childItems5.add(ChildItem("JavaScript", R.drawable.javascript))

        parentList.add(
            ParentItem(
                "Backend",
                R.drawable.backend,
                childItems5
            )
        )
    }
}