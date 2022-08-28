
$(document).ready(function() {
	$('table #editButton').on('click', function(event) {
		event.preventDefault();

		var href = $(this).attr('href');

		$.get(href, function(state, status ) {
			$('#idEdit').val(state.id); 
			$('#nameEdit').val(state.name);
			$('#capitalEdit').val(state.capital);
			$('#codeEdit').val(state.code);
			$('#detailsEdit').val(state.details);
			$('#ddlCountryEdit').val(state.countryid);
			event.preventDefault();
		});

		$('#editModal').modal('show');
	});


	$('table #delButton').on('click', function(event) {
		event.preventDefault();

		var href = $(this).attr('href');

		$('#confirmDeleteBtn').attr('href', href);



		$('#deleteModal').modal('show');
	});

});
