# Bank app (15 minutes to implement)

Bank app shows one account
- show the balance
- Transfer money to another account
- switch to another account

Accounts:
- Corporate
- Personal

---

Account=

Fields
- id // int-immutable
- number // Str-immutable
- name // Str-immutable
- Type (Corporate, Personal) //Class-immutable
- balance // int-immutable

Bank app=
- accounts
- activeAccounts
- show the balance - the balance of current account
- Transfer - from the current, to another account
- switchToAccount (id) - change of the current account
- switch to account (substring) {
    - account
    - switchToAccount(id)