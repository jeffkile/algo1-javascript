var id; // id[i] = parent of i
var size; // size[i] = number of objects in subtree rooted at i
var count; // Number of un-connected componets

var init = function (n) {
  var i = 0;
  id = new Array(n);
  size = new Array(n);
  count = n;

  for(i; i<n; i+=1) {
    id[i] = i;
    size[i] = i;
  }
};

var root = function (i) {
  while (i != id[i]) {
    // id[i] = id[id[i]];
    i = id[i];
  }
  return i;
};

var connected = function (p, q) {
  return root(p) === root(q);
};

var union = function (p, q) {
  var i = root(p);
  var j = root(q);
  if (i === j) return;

  if (size[i] < size[j]) {
    id[i] = j;
    size[j] += size[i];
  }
  else {
    id[j] = i;
    size[i] += size[j];
  }

  count = count - 1; 
};

var getId = function () {
  return id;
};

var getCount = function () {
  return count;
};

module.exports = { 'init': init, 'connected': connected, 'union': union, 'id': getId, 'count': getCount};
