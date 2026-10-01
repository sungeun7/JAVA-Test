int [] score = { 100, 90, 80, 70, 60};
int [] score = new int [] { 100, 90, 80, 70, 60};


int [] score;
score = { 100, 90, 80, 70, 60}; // 오류 발생

int [] score;
score = new int [] { 100, 90, 80, 70, 60}; // 정상


int add(int [] arr) { }

int result = add({ 100, 90, 80, 70, 60}); // 오류 발생
int result = add(new int [] { 100, 90, 80, 70, 60}); // 정상