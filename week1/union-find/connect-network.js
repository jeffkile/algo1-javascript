var uf  = require('./union-find');

var users = ['jeff', 'tom', 'frank', 'bill', 'sam'];

var log = [
  { time: 1,
    id1: 3,
    id2: 0 },
  { time: 2,
    id1: 1,
    id2: 4 },
  { time: 3,
    id1: 2,
    id2: 0 },
  { time: 4,
    id1: 1,
    id2: 3 }, 
  { time: 5,
    id1: 2,
    id2: 0 },
  { time: 6,
    id1: 2,
    id2: 3 },
  { time: 7,
    id1: 1,
    id2: 4 },
  { time: 8,
    id1: 4,
    id2: 3 },
  { time: 9,
    id1: 0,
    id2: 1 },
  { time: 10,
    id1: 2,
    id2: 3 },
  { time: 11,
    id1: 4,
    id2: 1 }
];

console.log(users.length);
uf.init(users.length);

var i = 0;
console.log('id ' + uf.id());
while(i<log.length && uf.count()>1) {
  if(!uf.connected(log[i].id1, log[i].id2)) {
    uf.union(log[i].id1, log[i].id2);
    console.log('id ' + uf.id());
    console.log(uf.count());
  }
  i++;
}

console.log("All Connected? " + uf.count() + (uf.count() === 1));
