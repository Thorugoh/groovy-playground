map = [a: 0, b: 1, c: 2]
println map

assert map['a'] == 0
assert map.b == 1
assert map.get('c') == 2

map['a'] = 'x'
map.b = 'y'
map.put('c', 'z')
assert map == [a: 'x', b: 'y', c: 'z']