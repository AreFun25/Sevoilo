# Mencetak ke layar tulisan sekaligus varibael
puts "Hello!"
nama = "Contoh"
puts "My name is #{nama}"

# Deklarasi sekaligus inisialisasi variabel baru
x = [2, 4, 16, 8]
x.sort!
puts x[0] + x[3]

# Menghitung akar 2 dari sebuah angka
num = x[3]
puts root_2 = Math.sqrt(num)

# Menghitung pangkat
base = x[1]
exponent = 3
puts result = base ** exponent

#Inputan keyboard
print "Enter a number: "
user_input = gets.chomp.to_i
puts "You entered: {user_input}"
