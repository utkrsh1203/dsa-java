#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }

    ~Node()
    {
        delete next;
    }
};

void insertAtHead(Node *&head, int d)
{
    Node *temp = new Node(d);
    temp->next = head;
    head = temp;
}
void insertAtTail(Node *&tail, int d)
{
    Node *temp = new Node(d);

    tail->next = temp;
    tail = temp;
}

void print(Node *&head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void insertAtPosition(Node *&tail, Node *&head, int position, int d)
{
    Node *temp = head;
    int cnt = 1;

    Node *NewNode = new Node(d);

    if (position == 1)
    {
        insertAtHead(head, d);
        return;
    }
    while (cnt < position - 1)
    {
        temp = temp->next;
        cnt++;
    }

    if (temp->next == NULL)
    {
        insertAtTail(tail, d);
        return;
    }

    NewNode->next = temp->next;
    temp->next = NewNode;
}

void deleteAtPostion(Node *&head, int position)
{

    Node *temp = head;
    if (position == 1)
    {
        head = head->next;
        return;
    }

    int cnt = 1;
    while (cnt < position - 1 && temp->next != NULL)
    {
        temp = temp->next;
        cnt++;
    }
    Node *deleted = temp->next;
    temp->next = deleted->next;
    deleted->next = NULL;
}

int main()
{
    Node *node1 = new Node(1);

    // cout << node1->data << endl;

    Node *head = node1;
    Node *tail = node1;

    insertAtHead(head, 0);
    insertAtTail(tail, 4);

    insertAtPosition(tail, head, 3, 2);
    insertAtPosition(tail, head, 4, 3);

    deleteAtPostion(head, 5);

    print(head);
}
