import 'package:flutter/material.dart';
class PageListview extends StatelessWidget {
  const PageListview({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("My list view"),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
      ),
      body: ListView.separated(
        itemBuilder: (context, index){
          SanPham s=data[index];
          return Card(
            elevation: 10,
            child: ListTile(
              leading: Text("${index+1}",
              style: TextStyle(fontSize: 16),),
              title:Text(s.ten),
              trailing: Text("${s.gia} VND",style: TextStyle(color: Colors.red),
              ),
              subtitle: Text("Trai cay Viet Gap",style: TextStyle(fontStyle: FontStyle.italic),),
              onTap:() {
                ScaffoldMessenger.of(context).clearSnackBars();
                ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                  content: Text("Ban chon ${s.ten}"),
                  duration: Duration(seconds: 5),
                  )
                );
              },
            ),
          );
        },
        separatorBuilder: (context, index) =>Divider(thickness: 1.5,),
        itemCount: data.length),
    );
  }
}
class SanPham{
  String ten;
  int gia;
  SanPham({
      required this.ten,
      required this.gia,
  });
}
var data=[
  SanPham(ten: "Me",gia: 35000),
  SanPham(ten: "Chanh",gia: 15000),
  SanPham(ten: "Xoai",gia: 25000),
  SanPham(ten: "Sori",gia: 27000),
  SanPham(ten: "CR",gia: 15000),
  SanPham(ten: "Le",gia: 50000),
  SanPham(ten: "Thi",gia: 35000),
  SanPham(ten: "Hong",gia: 37000),
  SanPham(ten: "Dao",gia: 57000),
  SanPham(ten: "Buoi",gia: 31000),
  SanPham(ten: "Cam",gia: 12000),
  SanPham(ten: "DauTay",gia: 52000),
  SanPham(ten: "Chuoi",gia: 22000),
  SanPham(ten: "Sau rieng",gia: 95000),
  SanPham(ten: "Mit",gia: 36000),
  SanPham(ten: "Oi",gia: 35000),

];

