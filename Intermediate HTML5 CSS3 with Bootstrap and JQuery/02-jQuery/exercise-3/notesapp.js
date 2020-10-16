$(document).ready(function(){

	console.log('ohai');
	
	$('.save').click(function(){
		console.log($(this));
		console.log('saving this book'+' now');
	});
	$('.delete').click(function(){
		console.log('deleting this book');
	});

});