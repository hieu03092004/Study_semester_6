import 'package:flutter/material.dart';
import 'package:helloworld/profile/page_profile.dart';
import 'package:helloworld/layout/page_listview.dart';
class PageHome extends StatelessWidget {
  const PageHome({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("My app"),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary
      ), 
      body:SingleChildScrollView(
        child: Center(
          child: Column(
            children: [
              buildButton(context, title: "My Profile", destination: PageProfile()),
              buildButton(context, title: "My list View", destination: PageListview())
            ],
          ),
        ),
      )
    );
  }
}
Widget buildButton(BuildContext context,{required String title,required Widget destination}){
  return Padding(
    padding: const EdgeInsets.only(top: 5,bottom: 5),
    child: Container(
      width: MediaQuery.of(context).size.width*2/3,
      child: ElevatedButton(
        onPressed: () {
          Navigator.of(context).push(MaterialPageRoute(
            builder: (context) => destination,));
        },
        child: Text(title,style: (TextStyle(fontSize: 20)),),),
    ),
  );
}
