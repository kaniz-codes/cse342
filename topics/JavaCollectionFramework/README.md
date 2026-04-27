# Java Collection Framework

- ArrayList
- LinkedList
- PriorityQueue
- Stack
- Set
- HashSet
- Map
- HashMap

## Common Java Collection Framework functions

| Operation | ArrayList | LinkedList | PriorityQueue | Stack | Set | HashSet | Map | HashMap |
|---|---|---|---|---|---|---|---|---|
| Add element | `add()` | `add()`, `addFirst()`, `addLast()` | `add()`, `offer()` | `push()`, `add()` | `add()` | `add()` | `put(key, value)` | `put(key, value)` |
| Access element | `get(index)` | `get(index)`, `getFirst()`, `getLast()` | `peek()` | `peek()` | Not index-based | Not index-based | `get(key)` | `get(key)` |
| Update element | `set(index, value)` | `set(index, value)` | Not directly | Not directly | Not directly | Not directly | `put(key, value)`, `replace()` | `put(key, value)`, `replace()` |
| Remove element | `remove(index)`, `remove(value)` | `remove()`, `removeFirst()`, `removeLast()` | `poll()`, `remove()` | `pop()`, `remove()` | `remove()` | `remove()` | `remove(key)` | `remove(key)` |
| Check element | `contains()` | `contains()` | `contains()` | `contains()` | `contains()` | `contains()` | `containsKey()`, `containsValue()` | `containsKey()`, `containsValue()` |
| Size | `size()` | `size()` | `size()` | `size()` | `size()` | `size()` | `size()` | `size()` |
| Empty check | `isEmpty()` | `isEmpty()` | `isEmpty()` | `empty()`, `isEmpty()` | `isEmpty()` | `isEmpty()` | `isEmpty()` | `isEmpty()` |
| Clear all | `clear()` | `clear()` | `clear()` | `clear()` | `clear()` | `clear()` | `clear()` | `clear()` |
| Iterate | `for-each`, `Iterator` | `for-each`, `Iterator` | `for-each`, `Iterator` | `for-each`, `Iterator` | `for-each`, `Iterator` | `for-each`, `Iterator` | `keySet()`, `values()`, `entrySet()` | `keySet()`, `values()`, `entrySet()` |
| Duplicate allowed? | Yes | Yes | Yes | Yes | No | No | Keys: No, Values: Yes | Keys: No, Values: Yes |
| Order | Insertion order | Insertion order | Priority order | LIFO | Depends on implementation | No fixed order | Depends on implementation | No fixed order |