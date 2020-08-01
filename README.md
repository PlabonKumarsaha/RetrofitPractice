1.Add the retrofit dependency library

 implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'

2. Take user permit (top of <application>)
<uses-permission android:name="android.permission.INTERNET"/>

3. Make a model class and annotate with @SerializedName .The @SerializedName 
annotation can be used to serialize a field with a different name 
instead of an actual field name. We can provide the expected serialized name as an annotation attribute, 
Gson can make sure to read or write a field with the provided name.Make sure this @Serialized name and JSON attribute name is exactly the same
https://www.tutorialspoint.com/what-to-use-serializedname-annotation-using-gson-in-java#:~:text=The%20%40SerializedName%20annotation%20can%20be,field%20with%20
the%20provided%20name.

4.Add a package name retrofit and add a RerofitClient class.
create a retrofit instance and a getRetrofitInsatnce method which returs Retrofit object. Create a retrofit instance builder there.Add URL in the baselIne.
add convertion factory to make it GSON from any other data format.

5.Add apiInterface interface with an abstract method which annotates GEt method.The @GET annotation declares that this request uses the HTTP GET method. we use GET method.
 
6. now create an istace of the interface  and pass it to RetrofitClient Instace. Call this method to get the method from interface . now enque the responses.

now show fetch data using GSON

7. now create recyler view and in therecycler view add the Adapter to render the data.
8.inflate the recylerview
