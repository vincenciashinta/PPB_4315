package com.dicoding.foodapps

object FoodsData {

    private val foodNames = arrayOf("Chicken Gordon Bleu",
            "Wagyu Steak 200gr",
            "Salmon Steak",
            "Spaghetti",
            "Lasagna",
            "Fish and Chips",
            "Dimsum")


    private val foodsDetail = arrayOf("Harga : Rp 65.000 \n\nProcessed chicken that is breaded and then fried  ",
            "Harga : Rp 189.000 \n\n",
            "Harga : Rp 270.000 \n\n",
            "Harga : Rp 45.000 \n\n",
            "Harga : Rp 50.000 \n\n",
            "Harga : Rp 45.000 \n\n",
            "Harga : Rp 20.000 \n\n")


    private val foodsImages = intArrayOf(R.drawable.chicken,
            R.drawable.steak,
            R.drawable.salmon,
            R.drawable.spgh,
            R.drawable.lasagna,
            R.drawable.fish,
            R.drawable.dimsum)




    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodsDetail[position]
                food.photo = foodsImages[position]
                list.add(food)
            }
            return list
        }
}