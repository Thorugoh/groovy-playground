list = [10, 20, 30, 40, 50]
println list

println list[0]
println list.get(1)

println list.size()

assert list[0] == 10

list = [0, 1, 2]
assert list[-1] == 2
assert list[-1..0] == list.reverse()


// It implements all java.util.List methods
assert [1, 2, 3] << 1 == [1, 2, 3, 1]
assert [1, 2, 3] + [1] == [1, 2, 3, 1]
assert [1, 2, 3, 1] - [1] == [2, 3]
assert [1, 2, 3] * 2 == [1, 2, 3, 1, 2, 3]
assert [1, [2, 3]].flatten() == [1, 2, 3]
assert [1, 2, 3].reverse() == [3, 2, 1]
assert [1, 2, 3].collect { it + 3} == [4, 5, 6]
assert  [1, 2, 3, 1].unique().size() == 3
assert [1, 2, 3, 1].count(1) == 2
assert [1, 2, 3, 4].min() == 1
assert [1, 2, 3, 4].max() == 4
assert [1, 2, 3, 4].sum() == 10
assert [4, 3, 2, 1].sort() == [1, 2, 3, 4]
assert [4, 2, 1, 3].find { it % 2 == 0 } == 4
assert [4, 2, 1, 3].findAll { it % 2 == 0 } == [4, 2]