function Publish() {

var a =document.getElementById("exampleTextarea").value;
document.getElementById("timeline_paraone").innerHTML = a;
if(a.length>0)
{
$("#pub_class").addClass("well");
}

}


/*For uploading cover pickk*/
$(function () {
$("#cover").change(function () {
if (this.files && this.files[0]) {
var reader = new FileReader();
reader.onload = coverimageIsLoaded;
reader.readAsDataURL(this.files[0]);
}
});
});

function coverimageIsLoaded(e) {
$('#mycoverImg').attr('src', e.target.result);
}