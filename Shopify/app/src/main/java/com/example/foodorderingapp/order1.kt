package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.net.Inet4Address
import java.security.cert.X509CRL
import java.util.zip.Adler32

class order1 : AppCompatActivity() {
    //lateinit var username: TextView
    lateinit var imgbtn1: ImageView
    lateinit var imgbtn2: ImageView
    lateinit var imgbtn3: ImageView
    lateinit var imgbtn4: ImageView
    lateinit var imgbtn5: ImageView
    lateinit var imgbtn6: ImageView
    lateinit var imgbtn7: ImageView
    lateinit var imgbtn8: ImageView
    lateinit var img1: ImageView
    lateinit var img2: ImageView
    lateinit var img3: ImageView
    lateinit var id1: TextView
    lateinit var id2: TextView
    lateinit var id3: TextView
    lateinit var name1: TextView
    lateinit var name2: TextView
    lateinit var name3: TextView
    lateinit var pname1: TextView
    lateinit var pname2: TextView
    lateinit var pname3: TextView
    lateinit var description1: TextView
    lateinit var description2: TextView
    lateinit var description3: TextView
    lateinit var sprice1: TextView
    lateinit var sprice2: TextView
    lateinit var sprice3: TextView
    lateinit var sprice4: TextView
    lateinit var sprice5: TextView
    lateinit var sprice6: TextView
    lateinit var sprice7: TextView
    lateinit var pprice1: TextView
    lateinit var pprice2: TextView
    lateinit var pprice3: TextView
    lateinit var pprice4: TextView
    lateinit var pprice5: TextView
    lateinit var pprice6: TextView
    lateinit var pprice7: TextView
    lateinit var add1: Button
    lateinit var add2: Button
    lateinit var add3: Button
    lateinit var padd1: Button
    lateinit var padd2: Button
    lateinit var padd3: Button
    //lateinit var atc: Button
    lateinit var item1: TextView
    lateinit var item2: TextView
    lateinit var item3: TextView
    lateinit var item4: TextView
    lateinit var item5: TextView
    lateinit var item6: TextView
    lateinit var item7: TextView
    lateinit var price1: TextView
    lateinit var price2: TextView
    lateinit var price3: TextView
    lateinit var price4: TextView
    lateinit var price5: TextView
    lateinit var price6: TextView
    lateinit var price7: TextView
    lateinit var tprice1: TextView
    lateinit var tprice2: TextView
    lateinit var tprice3: TextView
    lateinit var tprice4: TextView
    lateinit var tprice5: TextView
    lateinit var tprice6: TextView
    lateinit var tprice7: TextView
    lateinit var amount1: TextView
    lateinit var amount2: TextView
    lateinit var amount3: TextView
    lateinit var amount4: TextView
    lateinit var amount5: TextView
    lateinit var amount6: TextView
    lateinit var amount7: TextView
    lateinit var minus1: Button
    lateinit var minus2: Button
    lateinit var minus3: Button
    lateinit var minus4: Button
    lateinit var minus5: Button
    lateinit var minus6: Button
    lateinit var minus7: Button
    lateinit var plus1: Button
    lateinit var plus2: Button
    lateinit var plus3: Button
    lateinit var plus4: Button
    lateinit var plus5: Button
    lateinit var plus6: Button
    lateinit var plus7: Button
    lateinit var vat : TextView
    lateinit var dc : TextView
    lateinit var finaltotal: TextView
    lateinit var finish: Button
    lateinit var address: TextView
    lateinit var username: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order1)

        var nametextList = arrayListOf<String>("noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem","noitem")
        var pricetextlist = arrayListOf<String>("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0")
        var amounttextlist = arrayListOf<String>("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0")
        var totaltextlist = arrayListOf<String>("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0")
        //val str02 = intent.getStringExtra("mytext")

        //val str04 = "Hi $str02"
        item1=findViewById(R.id.in1)
        item2=findViewById(R.id.in2)
        item3=findViewById(R.id.in3)
        item4=findViewById(R.id.in4)
        item5=findViewById(R.id.in5)
        item6=findViewById(R.id.in6)
        item7=findViewById(R.id.in7)
        sprice1=findViewById(R.id.sprice1)
        sprice2=findViewById(R.id.sprice2)
        sprice3=findViewById(R.id.sprice3)
        sprice4=findViewById(R.id.sprice4)
        sprice5=findViewById(R.id.sprice5)
        sprice6=findViewById(R.id.sprice6)
        sprice7=findViewById(R.id.sprice7)
        tprice1=findViewById(R.id.tprice1)
        tprice2=findViewById(R.id.tprice2)
        tprice3=findViewById(R.id.tprice3)
        tprice4=findViewById(R.id.tprice4)
        tprice5=findViewById(R.id.tprice5)
        tprice6=findViewById(R.id.tprice6)
        tprice7=findViewById(R.id.tprice7)
        amount1=findViewById(R.id.a1)
        amount2=findViewById(R.id.a2)
        amount3=findViewById(R.id.a3)
        amount4=findViewById(R.id.a4)
        amount5=findViewById(R.id.a5)
        amount6=findViewById(R.id.a6)
        amount7=findViewById(R.id.a7)
        minus1=findViewById(R.id.minus1)
        minus2=findViewById(R.id.minus2)
        minus3=findViewById(R.id.minus3)
        minus4=findViewById(R.id.minus4)
        minus5=findViewById(R.id.minus5)
        minus6=findViewById(R.id.minus6)
        minus7=findViewById(R.id.minus7)
        plus1=findViewById(R.id.plus1)
        plus2=findViewById(R.id.plus2)
        plus3=findViewById(R.id.plus3)
        plus4=findViewById(R.id.plus4)
        plus5=findViewById(R.id.plus5)
        plus6=findViewById(R.id.plus6)
        plus7=findViewById(R.id.plus7)
        username = findViewById(R.id.textView1)
        //username.text=str04
        add1= findViewById(R.id.addbtn1)
        add2= findViewById(R.id.addbtn2)
        add3= findViewById(R.id.addbtn3)
        imgbtn1 = findViewById(R.id.imgbtn1)
        imgbtn2 = findViewById(R.id.imgbtn2)
        imgbtn3 = findViewById(R.id.imgbtn3)
        imgbtn4 = findViewById(R.id.imgbtn4)
        imgbtn5= findViewById(R.id.imgbtn5)
        imgbtn6= findViewById(R.id.imgbtn6)
        imgbtn7= findViewById(R.id.imgbtn7)
        img1= findViewById(R.id.img1)
        img2= findViewById(R.id.img2)
        img3= findViewById(R.id.img3)
        id1=findViewById(R.id.id1)
        id2=findViewById(R.id.id2)
        id3=findViewById(R.id.id3)
        name1=findViewById(R.id.name1)
        name2=findViewById(R.id.name2)
        name3=findViewById(R.id.name3)
        description1=findViewById(R.id.des1)
        description2=findViewById(R.id.des2)
        description3=findViewById(R.id.des3)
        price1=findViewById(R.id.price1)
        price2=findViewById(R.id.price2)
        price3=findViewById(R.id.price3)
        //atc = findViewById(R.id.button2)
        finish = findViewById(R.id.finish)
        vat=findViewById(R.id.vat)
        dc=findViewById(R.id.dc)
        finaltotal=findViewById(R.id.finaltotal)
        address=findViewById(R.id.address)
        var descriptionList= arrayListOf<String>("2 chicken patties, bbq sauce, braised onions","2x chicken sausage, mayonnaise, cheese","Giant chicken patty, teriyaki sauce, pepperoni",
            "pepsi","sprite","fanta",
            "mozzarella cheese, tomato sauce, vegetables","sliced chicken, pepperoni, mayonnaise","mushroom, white sauce, avocado",
            "chicken sausage, cheese, white sauce","grilled sausage, bbq sauce,jalapeno ","2x spicy sausage,hot mayo, braised onions",
            "roasted chicken,salad,teriyaki sauce ","grilled chicken , hot mayo, avocado","cheddar cheese , vegetables, mustard sauce",
            "wonton, spring roll, shrimp toast","fried rice,chowmein,chicken chop suey","szechuan style vegetable,cashew nut salad,mix mushroom sauce vegetables ",
            "mutton, rice, boiled egg","roasted chicken, rice, kebab","masala chicken, rice, tamarind sauce")

        var nameList = arrayListOf<String>("bbq burger","chicken sausage cheese burger","giganto chicken burger",
            "soft drinks1","soft drinks2","soft drinks3",
            "cheese crust pizza","chicken pepperoni pizza","creamy mushroom pizza",
            "chicken cheese hot dog","smoked chicken hot dog","double spicy hot dog",
            "subway sandwitch","mayo grilled sandwitch","vegetable cheese sandwitch",
            "chinese appetizers","chinese main course","chinese vegetable",
            "kacchi biryani","chicken biryani","masala dum biryani")
        var amountlist = arrayListOf<Int>(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        var priceList = arrayListOf<Int>(240,310,280,60,75,85,275,310,350,175,210,340,265,320,125,410,285,200,275,150,215)
        var totallist = arrayListOf<Int>(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        name1.text=nameList[0]
        name2.text=nameList[1]
        name3.text=nameList[2]
        id1.text="1"
        id2.text="2"
        id3.text="3"
        img1.setImageResource(R.drawable.a)
        img2.setImageResource(R.drawable.b)
        img3.setImageResource(R.drawable.c)
        description1.text=descriptionList[0]
        description2.text=descriptionList[1]
        description3.text=descriptionList[2]
        price1.text=priceList[0].toString()
        price2.text=priceList[1].toString()
        price3.text=priceList[2].toString()
        val str02 = intent.getStringExtra("mytext")
        //val str02=intent.getStringExtra("mytext")
        val str03 = "Hi $str02"
        username.text=str03
        /*atc.setOnClickListener{
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }*/

        plus1.setOnClickListener{
            var name= item1.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus2.setOnClickListener{
            var name= item2.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus3.setOnClickListener{
            var name= item3.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus4.setOnClickListener{
            var name= item4.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus5.setOnClickListener{
            var name= item5.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus6.setOnClickListener{
            var name= item6.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        plus7.setOnClickListener{
            var name= item7.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus1.setOnClickListener{
            var name= item1.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus2.setOnClickListener{
            var name= item2.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus3.setOnClickListener{
            var name= item3.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus4.setOnClickListener{
            var name= item4.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus5.setOnClickListener{
            var name= item5.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus6.setOnClickListener{
            var name= item6.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        minus7.setOnClickListener{
            var name= item7.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i] && amountlist[i]!=0)
                {
                    amountlist[i]=amountlist[i]-1
                    break
                }
            }
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }

        finish.setOnClickListener{
            val context = this
            if(address.text.toString().isEmpty())
            {
                Toast.makeText(context, "Address not filled", Toast.LENGTH_SHORT).show()
            }
            else if(item1.text.toString()=="noitem")
            {
                Toast.makeText(context, "No items ordered", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(context, "Your order has been taken", Toast.LENGTH_SHORT).show()
                val myIntent = Intent(this@order1, Home::class.java)
                myIntent.putExtra("mytext", str02)
                startActivity(myIntent)
            }
        }
        add1.setOnClickListener{
            var name= name1.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        add2.setOnClickListener{
            var name= name2.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        add3.setOnClickListener{
            var name= name3.text.toString()
            for (i in 0..20)
            {
                if(name==nameList[i])
                {
                    amountlist[i]=amountlist[i]+1
                    break
                }
            }
            var count: Int = 0
            for (i in 0..20)
            {
                if(amountlist[i]>0)
                {
                    nametextList[count]=nameList[i]
                    pricetextlist[count]=priceList[i].toString()
                    amounttextlist[count]=amountlist[i].toString()
                    totaltextlist[count]=(priceList[i]*amountlist[i]).toString()
                    count=count+1
                }
                if(count>=7)
                {
                    break
                }
            }
            item1.text=nametextList[0]
            item2.text=nametextList[1]
            item3.text=nametextList[2]
            item4.text=nametextList[3]
            item5.text=nametextList[4]
            item6.text=nametextList[5]
            item7.text=nametextList[6]
            sprice1.text=pricetextlist[0]
            sprice2.text=pricetextlist[1]
            sprice3.text=pricetextlist[2]
            sprice4.text=pricetextlist[3]
            sprice5.text=pricetextlist[4]
            sprice6.text=pricetextlist[5]
            sprice7.text=pricetextlist[6]
            amount1.text=amounttextlist[0]
            amount2.text=amounttextlist[1]
            amount3.text=amounttextlist[2]
            amount4.text=amounttextlist[3]
            amount5.text=amounttextlist[4]
            amount6.text=amounttextlist[5]
            amount7.text=amounttextlist[6]
            tprice1.text=totaltextlist[0]
            tprice2.text=totaltextlist[1]
            tprice3.text=totaltextlist[2]
            tprice4.text=totaltextlist[3]
            tprice5.text=totaltextlist[4]
            tprice6.text=totaltextlist[5]
            tprice7.text=totaltextlist[6]
            var sum=0
            for (i in 0 .. 6)
            {
                sum=sum+totaltextlist[i].toInt()
            }
            if(item1.text!="noitem")
            {
                dc.text="20"
                sum=sum+20
            }
            finaltotal.text=sum.toString()
        }
        imgbtn1.setOnClickListener{
            name1.text=nameList[0]
            name2.text=nameList[1]
            name3.text=nameList[2]
            id1.text="1"
            id2.text="2"
            id3.text="3"
            img1.setImageResource(R.drawable.a)
            img2.setImageResource(R.drawable.b)
            img3.setImageResource(R.drawable.c)
            description1.text=descriptionList[0]
            description2.text=descriptionList[1]
            description3.text=descriptionList[2]
            price1.text=priceList[0].toString()
            price2.text=priceList[1].toString()
            price3.text=priceList[2].toString()
        }
        imgbtn2.setOnClickListener{
            name1.text=nameList[3]
            name2.text=nameList[4]
            name3.text=nameList[5]
            id1.text="4"
            id2.text="5"
            id3.text="6"
            img1.setImageResource(R.drawable.d)
            img2.setImageResource(R.drawable.e)
            img3.setImageResource(R.drawable.f)
            description1.text=descriptionList[3]
            description2.text=descriptionList[4]
            description3.text=descriptionList[5]
            price1.text=priceList[3].toString()
            price2.text=priceList[4].toString()
            price3.text=priceList[5].toString()
        }
        imgbtn3.setOnClickListener{
            name1.text=nameList[6]
            name2.text=nameList[7]
            name3.text=nameList[8]
            id1.text="7"
            id2.text="8"
            id3.text="9"
            img1.setImageResource(R.drawable.g)
            img2.setImageResource(R.drawable.h)
            img3.setImageResource(R.drawable.i)
            description1.text=descriptionList[6]
            description2.text=descriptionList[7]
            description3.text=descriptionList[8]
            price1.text=priceList[6].toString()
            price2.text=priceList[7].toString()
            price3.text=priceList[8].toString()
        }
        imgbtn4.setOnClickListener{
            name1.text=nameList[9]
            name2.text=nameList[10]
            name3.text=nameList[11]
            id1.text="10"
            id2.text="11"
            id3.text="12"
            img1.setImageResource(R.drawable.j)
            img2.setImageResource(R.drawable.k)
            img3.setImageResource(R.drawable.l)
            description1.text=descriptionList[9]
            description2.text=descriptionList[10]
            description3.text=descriptionList[11]
            price1.text=priceList[9].toString()
            price2.text=priceList[10].toString()
            price3.text=priceList[11].toString()
        }
        imgbtn5.setOnClickListener{
            name1.text=nameList[12]
            name2.text=nameList[13]
            name3.text=nameList[14]
            id1.text="13"
            id2.text="14"
            id3.text="15"
            img1.setImageResource(R.drawable.m)
            img2.setImageResource(R.drawable.n)
            img3.setImageResource(R.drawable.o)
            description1.text=descriptionList[12]
            description2.text=descriptionList[13]
            description3.text=descriptionList[14]
            price1.text=priceList[12].toString()
            price2.text=priceList[13].toString()
            price3.text=priceList[14].toString()
        }
        imgbtn6.setOnClickListener{
            name1.text=nameList[15]
            name2.text=nameList[16]
            name3.text=nameList[17]
            id1.text="16"
            id2.text="17"
            id3.text="18"
            img1.setImageResource(R.drawable.p)
            img2.setImageResource(R.drawable.q)
            img3.setImageResource(R.drawable.r)
            description1.text=descriptionList[15]
            description2.text=descriptionList[16]
            description3.text=descriptionList[17]
            price1.text=priceList[15].toString()
            price2.text=priceList[16].toString()
            price3.text=priceList[17].toString()
        }
        imgbtn7.setOnClickListener{
            name1.text=nameList[18]
            name2.text=nameList[19]
            name3.text=nameList[20]
            id1.text="19"
            id2.text="20"
            id3.text="21"
            img1.setImageResource(R.drawable.s)
            img2.setImageResource(R.drawable.t)
            img3.setImageResource(R.drawable.u)
            description1.text=descriptionList[18]
            description2.text=descriptionList[19]
            description3.text=descriptionList[20]
            price1.text=priceList[18].toString()
            price2.text=priceList[19].toString()
            price3.text=priceList[20].toString()
        }
    }
}