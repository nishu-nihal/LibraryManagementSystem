<script>
function validateForm() {
  // Get form elements
  const name = document.getElementById("name");
  const email = document.getElementById("email");
  const password = document.getElementById("password");
  const confirmPassword = document.getElementById("confirmPassword");

  // Basic validation
  if (name.value === "") {
    alert("Please enter your name.");
    return false;
  }

  if (email.value === "") {
    alert("Please enter your email address.");
    return false;
  }

  if (password.value === "") {
    alert("Please enter your password.");
    return false;
  }

  if (confirmPassword.value !== password.value) {
    alert("Passwords do not match.");
    return false;
  }

  // Password strength validation (optional)
  // ...

  return true;
}
</script>