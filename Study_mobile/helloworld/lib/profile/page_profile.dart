import 'package:flutter/material.dart';

class  PageProfile extends StatefulWidget {
  const PageProfile({super.key});

  @override
  State<PageProfile> createState() => _PageProfile();
}

class _PageProfile extends State<PageProfile> {
  @override
  String ngaySinh="18/12/2004";
  String ?gioiTinh="Nam";
  List<String>nnlts=["Java","C++","C","Python","Javascript"];
  String? nnlt;
  int index=0;
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: Text("My Profile"),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
      ),
      body:_buildBody(index) ,
      drawer: Drawer(
        child: ListView(
          children: [
            UserAccountsDrawerHeader(
              accountName: Text("hieuCodeNguAhuhu"),
              accountEmail: Text("hieuCodeNguAhuhu@gmail.com"),
              currentAccountPicture: CircleAvatar(
                radius: 40,
                child: Text("Ahuhu",style: TextStyle(color: Colors.white),),
                backgroundImage: AssetImage("asset/images/meo.jpg"),
              ),
            ),
            ListTile(
              leading: Icon(Icons.sms),
              title: Text("SMS"),
              trailing: Text("10"),
              onTap: () {
                Navigator.of(context).pop();
                setState(() {
                  index=1;
                });
              },

            ),
            ListTile(
              leading: Icon(Icons.mail),
              title: Text("Draft"),
              onTap: () {
                Navigator.of(context).pop();
                setState(() {
                  index=1;
                });
              },

            ),
            ListTile(
              leading: Icon(Icons.send),
              title: Text("Sent"),
              onTap: () {
                Navigator.of(context).pop();
                setState(() {
                  index=1;
                });
              },

            ),
            ListTile(
              leading: Icon(Icons.delete),
              title: Text("Delete"),
              onTap: () {
                Navigator.of(context).pop();
                setState(() {
                  index=1;
                });
              },

            ),
            SizedBox(height: 10,),
            Divider(thickness: 1.5,),
            SizedBox(height: 15,),
            ListTile(
              leading: Icon(Icons.settings),
              title: Text("Settings"),
              onTap: () {
                Navigator.of(context).pop();
                setState(() {
                  index=1;
                });
              },

            ),
          ],
        ),
      ),
      bottomNavigationBar: BottomNavigationBar(
        selectedItemColor: Colors.blue,
        unselectedItemColor: Colors.grey,
        currentIndex: index,
        items: [
          BottomNavigationBarItem(
            label: "Home",
            icon: Icon(Icons.home,color: Colors.blue[600],)
          ),
          BottomNavigationBarItem(
              label: "SMS",
              icon: Icon(Icons.sms,color: Colors.orange,)
          ),
          BottomNavigationBarItem(
              label: "Phone",
              icon: Icon(Icons.home,color: Colors.green,)
          )
        ],
        onTap: (value) {
          setState(() {
            index=value;
          });
        },
      ),
    );
  }
  Widget _buildHome(){
    return
      SingleChildScrollView(
      child: Padding(
        padding: const EdgeInsets.all(10),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [

            Center(
              child: Container(
                width: MediaQuery.of(context).size.width*3/4,
                child: Image.asset("asset/images/meo.jpg"),
              ),
            ),
            SizedBox(height: 10),
            Text("Họ và tên:"),

            Padding(
              padding: const EdgeInsets.only(left: 10),
              child: Text("Hiếu Code Ngu Ahuhu",style: TextStyle(fontSize: 18,color: Colors.blue),),
            ),
            SizedBox(height: 10,),
            Text("Ngày sinh:"),
            Row(
              children: [
                Expanded(child: Padding(
                  padding: const EdgeInsets.only(left: 10),
                  child: Text(ngaySinh,style: TextStyle(fontSize: 16),),
                )),
                IconButton(onPressed: () async{
                  DateTime ?selectDate=await showDatePicker(
                      context: context,
                      firstDate: DateTime(2000),
                      lastDate: DateTime(2040)
                  );
                  if(selectDate!=null){
                    ngaySinh="${selectDate.day}/${selectDate.month}/${selectDate.year}";
                    setState(() {

                    });
                  }
                },icon:Icon(Icons.calendar_month)),
                SizedBox(width: 30,)
              ],
            ),
            SizedBox(height: 10,),
            Text("Giới tính"),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                Expanded(
                  child: RadioListTile(
                    title: Text("Nam"),
                    value: "Nam", //Gia tri co dinh
                    groupValue: gioiTinh, //gia tri thay doi,khi groupvalue==value
                    // thi radio se duoc chon
                    onChanged:(value) {
                      setState(() {
                        gioiTinh=value;
                      });
                    },
                  ),
                ),
                Expanded(
                  child: RadioListTile(
                    title: Text("Nữ"),
                    value: "Nữ", //Gia tri co dinh
                    groupValue: gioiTinh, //gia tri thay doi,khi groupvalue==value
                    // thi radio se duoc chon
                    onChanged:(value) {
                      setState(() {
                        gioiTinh=value;
                      });
                    },
                  ),
                ),
              ],
            ),
            SizedBox(height: 10,),
            Text("Sở thích:"),
            Text("  Đọc sách,coi doraemon,đá bóng,chơi cờ vua",style: TextStyle(fontStyle: FontStyle.italic,fontSize: 18,color: Colors.green),),
            SizedBox(height: 20,),
            Text("Ngôn ngữ lập trình giỏi nhất của bạn",
              style: (TextStyle(fontStyle:FontStyle.italic)),),
            DropdownButton<String>(
              value: nnlt,//gia tri thay doi
              items: nnlts.map(
                    (e) {
                  return DropdownMenuItem<String>(
                      value: e,
                      child: Text(e)
                  );
                },
              ).toList(),
              onChanged: (value) {
                setState(() {
                  nnlt=value;
                });
              },)
          ],
        ),
      ),
    );
  }
  Widget _buildSMS(){
    return Center(
      child: Text("SMS",style: (TextStyle(fontSize: 20)),),
    );
  }
  Widget _buildPhone(){
    return Center(
      child: Text("Phone",style: (TextStyle(fontSize: 20)),),
    );
  }
  Widget _buildBody(int index){
    switch(index){
      case 0:return _buildHome();
      case 1:return _buildSMS();
      case 2:return _buildPhone();
    }
    return _buildHome();
  }
  
}

