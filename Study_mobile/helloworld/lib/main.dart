import 'package:flutter/material.dart';
import 'package:helloworld/layout/page_listview.dart';
import 'package:helloworld/page_home.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.lightBlue),
      ),
      home: PageHome(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});
  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  String message = "Ahuhu";
  TextEditingController txtName = TextEditingController();
  TextEditingController txtDob = TextEditingController();
  String imageURL = "https://static.vecteezy.com/system/resources/previews/025/220/125/non_2x/picture-a-captivating-scene-of-a-tranquil-lake-at-sunset-ai-generative-photo.jpg";

  @override
  Widget build(BuildContext context) {

    return Scaffold(
        appBar: AppBar(
          title: Text("My app"),
          backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        ),
        body: Padding(
          padding: const EdgeInsets.all(8.0),
          child: SingleChildScrollView(
          child: Center(
          child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
          Container(
          height: 300, width: 400,
          child: Image.network(imageURL),
        ),
        Text("Hello World", style: TextStyle(fontSize: 20),),
        Text("Chao $message", style: TextStyle(fontSize: 20),),
        TextField(
          controller: txtName,
          decoration: InputDecoration(
            labelText: "Name",
            hintText: "Enter your name",
          ),
        ),
        TextField(
          controller: txtDob,
          decoration: InputDecoration(
            labelText: "Date of birth",
            hintText: "Enter your date of birth",
          ),
          keyboardType: TextInputType.datetime,
        ),
        ElevatedButton(
        onPressed: () {
      if(message == "Ahuhu") {
        message = "Ahihi";
      } else {
        message = "Ahuhu";
      }
      ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Column(
            children: [
              Text("Hello ${txtName.text}"),
              Text("Happy birth day: ${txtDob.text}"),
            ],
          ))
      );
      setState(() {

      });
        },
            child: Text("click me")),
            Row(
              children: [
                Expanded(
                  flex: 1,
                  child: Container(
                    height: 100,
                    color: Colors.lightBlue,
                  ),
                ),
                Expanded(
                  flex: 2,
                  child: Container(
                    height: 100,
                    color: Colors.deepPurple,
                  ),
                ),
              ],
            )
          ],
          )
          ),
          ),
        ),
    );
  }

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    txtName.text = "example name";
    txtDob.text = "example day";
  }
}