$(document).ready(function(){
	$('.save').click(function(){
		var review = $(this).parent().parent('tr').find('.review').val();
		var author = $(this).parent().parent('tr').find('.author').html();
		var title = $(this).parent().parent('tr').find('.title').html();
		var bookId = $(this).parent().parent('tr').attr('id');
		console.log('Saving ');
		console.log(review);
		var bookToSave = {'review':review, 'author':author, 'title':title};

		localStorage[bookId] = JSON.stringify(bookToSave);

		console.log(JSON.parse(localStorage[bookId]));
	});

	$('.delete').click(function(){
		console.log('Deleting this record');
		var bookId = $(this).parent().parent('tr').attr('id');
		localStorage.removeItem(bookId);
		$(this).parent().parent('tr').remove();
	});
});
