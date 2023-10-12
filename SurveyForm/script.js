function submitForm(event) {
    event.preventDefault();

    let firstName = document.getElementById('firstName').value;
    let lastName = document.getElementById('lastName').value;
    let dob = document.getElementById('dob').value;
    let country = document.getElementById('country').value;
    let gender = document.querySelectorAll('input[name="gender"]:checked');
    let genderValues = Array.from(gender).map(el => el.value);
    let profession = document.getElementById('profession').value;
    let email = document.getElementById('email').value;
    let mobile = document.getElementById('mobile').value;

    let popupContent = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${genderValues.join(', ')}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    let popup = window.open('', '_blank', 'width=600,height=400');
    popup.document.write('<html><head><title>Survey Form Data</title></head><body>');
    popup.document.write(popupContent);
    popup.document.write('</body></html>');

    popup.addEventListener('beforeunload', function() {
        resetForm();
    });
}

function resetForm() {

    document.getElementById('firstName').value = '';
    document.getElementById('lastName').value = '';
    document.getElementById('dob').value = '';
    document.getElementById('country').value = '';
    let gender = document.querySelectorAll('input[name="gender"]');
    gender.forEach(el => el.checked = false);
    document.getElementById('profession').value = '';
    document.getElementById('email').value = '';
    document.getElementById('mobile').value = '';
}
