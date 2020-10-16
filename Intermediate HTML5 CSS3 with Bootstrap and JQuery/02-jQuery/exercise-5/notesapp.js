$(document).ready(function(){
	loadBooks();

	$('.add').click(function(){
		var review = $(this).parent().parent('tr').find('.review').val();
		var author = $(this).parent().parent('tr').find('.author').val();
		var title = $(this).parent().parent('tr').find('.title').val();
		var bookId = $(this).parent().parent('tr').attr('id');
		console.log('Saving ');
		console.log(review);
		var bookToSave = {'review':review, 'author':author, 'title':title};

		localStorage[bookId] = JSON.stringify(bookToSave);

		console.log(JSON.parse(localStorage[bookId]));
		// Things to try here:
		// 1. If this is the first book added in the list, show the titles
		// Then on page load, the list will be empty

		// 2.If there was an error when saving the book, display the issue
		// Hint: look up using a try/catch

		// 3. Save the checkbox value to local storage too! Hint: use
		// a boolean value (true or false)
	});

	$('.save').click(function(){
		var review = $(this).parent().parent('tr').find('.review').html();
		var author = $(this).parent().parent('tr').find('.author').html();
		var title = $(this).parent().parent('tr').find('.title').html();
		var bookId = $(this).parent().parent('tr').attr('id');
		console.log('Saving ');
		console.log(review);
		var bookToSave = {'review':review, 'author':author, 'title':title};

		localStorage[bookId] = JSON.stringify(bookToSave);

		console.log(JSON.parse(localStorage[bookId]));
		// Things to try here:
		// 1. If this is the first book added in the list, show the titles
		// Then on page load, the list will be empty

		// 2.If there was an error when saving the book, display the issue
		// Hint: look up using a try/catch

		// 3. Save the checkbox value to local storage too! Hint: use
		// a boolean value (true or false)
	});


	$('.delete').click(function(){
		console.log('Deleting this record');
		var bookId = $(this).parent().parent('tr').attr('id');
		localStorage.removeItem(bookId);
		$(this).parent().parent('tr').remove();
		// Things to try here:
		// 1. Add a nice transition when the row is deleted - try using
		// fadeOut() instead of remove()
	    // 2. Display a succesful message when the row is deleted - 
	    // Hint: look at using the bootstrap "contextual classes" and jQuery prepend()
		// 3. When there was one book in the list and it was deleted,
		// Also delete the title of the table - and display a message
		// Saying there are no books currently saved!
	});

	function loadBooks()
	{
		var i = 1;
		// Here you could try showing the headers, if there is at least one
		// book in the list
		while(localStorage['book'+i] !== undefined)
		{
			console.log('Loading book...'+localStorage['book'+i]);
			var book = JSON.parse(localStorage['book'+i]);
			console.log('Loaded book');
			console.log(book);
			$('#bookList thead').append(
				'<tr id="book'+i+'">'
					+'<td>'+i+'</td>'
					+'<td class="author">'+book.author+'</td>'
					+'<td class="title">'+book.title+'</td>'
					+'<td><input type="checkbox" /></td>'
					+'<td class="review">'+book.review+'</td>'
					+'<td><button type="button" class="btn btn-success save">Save</button></td>'
					+'<td><button type="button" class="btn btn-danger delete">Delete</button></td>'
				+'</tr>'
			);
			i++;
		}
		$('#bookSave tr').attr('id', 'book'+i);
	}
});
